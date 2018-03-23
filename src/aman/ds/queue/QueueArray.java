package aman.ds.queue;

public class QueueArray {
	private static int Capacity=10;
	public int queue[];
	public int size;
	public int rear;
	public int front;

	
    public QueueArray(){
    	queue=new int[Capacity];
    	size=front=rear=0;
    }
    public QueueArray(int cap){
    	this.Capacity=cap;
    	queue=new int[cap];
    	size=front=rear=0;
    }
    public void enQueue(int data){
    	if(size==Capacity){
    		System.out.println("Queue is full");
    	}
    		else{
    		size++;
    		queue[rear]=data;
    		rear=(rear+1)%Capacity;
    		}
    	}
    public int deQueue(){
    	if(size==0){
    		System.out.println("Queue is Empty");
    		return 0;
    	}
    		else
    	{
    			size--;
    			int data=queue[front%Capacity];
    		queue[front]=Integer.MIN_VALUE;
    	front=(front+1)%Capacity;
    	return data;
    	}
    }
    public boolean isEmpty(){
    	return size==0;
    }
    public boolean isFull(){
    	return size==Capacity;
    }
    public int size(){
    	return size;
    }
    public String toString(){
    	String s="";
    	for (int i = 0; i < size; i++) {
			s=s+" "+queue[(front+i)%Capacity];
		}
    	return s;
    }
    
	public static void main(String[] args) {
		QueueArray q=new QueueArray(2);
		q.enQueue(3);
		q.enQueue(5);
		System.out.println(q);
		System.out.println(q.isFull());
		q.deQueue();
		q.enQueue(15);
		System.out.println(q);

		

	}

}
