class FixedsizeArrayStack
{
            protected int capacity;
            public static final int CAPACITY=10;
            protected int []stackRep;
            protected int top=-1;
            public FixedsizeArrayStack()
            {
            this(CAPACITY);
            } 
                public FixedsizeArrayStack(int cap)
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
    System.out.println("Stack is full");
    else
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
     return item;
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
    s=s+","+stackRep[i];
    }
    }
    return s+"]";
    }
}
 


class Aman
{
public static void main(String args[])
{
FixedsizeArrayStack s=new FixedsizeArrayStack(4);
s.push(10);
s.push(15);
s.push(99);
s.pop();
s.push(55);
String a=s.toString();
System.out.println(a);
}
}
    