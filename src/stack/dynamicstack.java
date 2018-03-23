package aman.ds.stack;
class DynamicArrayStack
{
            protected int capacity;
            public static final int CAPACITY=16;
            public static final int MINCAPACITY=2;
            protected int []stackRep;
            protected int top=-1;
            public DynamicArrayStack()
            {
            this(CAPACITY);
            } 
                public DynamicArrayStack(int cap)
                 {
                 capacity=cap;
                 stackRep=new int[capacity]; 
                }
    public int size()
    {
     return top+1;
    }
    public boolean isEmpty()
    {
    return(top<0);
    }
    

    public void push(int item)
    {
    if(size()==capacity)
    {
    expand();
    }
    stackRep[++top]=item;
    }


    public int top()
    {
    if(top==-1)
    {
    System.out.println("Stack is Empty");
    return 0;
    } 
  else 
    return stackRep[top];
    }
   

    public int pop()
    {
     int item;
     if(isEmpty())
      {
     System.out.println("Stack is Empty");
     return 0;
     }
     else
     item=stackRep[top];
     stackRep[top--]=Integer.MIN_VALUE;
     shrink();
     return item;
    }


private void expand()
  {
   int length=size();
   int newStack[]=new int[length<<1];
   System.arraycopy(stackRep,0,newStack,0,length);
   stackRep=newStack;
   this.capacity=this.capacity<<1;
   
   
   
   }


private void shrink()
   {
    int length=this.capacity;
    if(length<=MINCAPACITY || (length>>2)<top)
    return;
    length=(top<<1);
    if(top<MINCAPACITY)
    length=MINCAPACITY;
    int newStack[]=new int[length];
    System.arraycopy(stackRep,0,newStack,0,top+1);
    stackRep=newStack;
    this.capacity=length;
    }  



public String toString()
    {
    String s;
    s="[";
    if(size()>0)
    {
     s=s+stackRep[0];
    }
    if(size()>1)
    {
    for(int i=1;i<=size();i++)
    {
    System.out.println(stackRep.length);	
    s=s+","+stackRep[i];
    }
    }
    return s+"]";
    }

 



public static void main(String args[])
{
DynamicArrayStack d=new DynamicArrayStack(20);
//DynamicArrayStack.MINCAPACITY=10;
d.push(15);
d.push(5);
d.push(55);
d.push(99);
d.push(62);
d.pop();
d.pop();
int size=d.size();
System.out.println(size);
String s=d.toString();
System.out.println(s);
}


}