package aman.ds.queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterLeaveQueue {
	Stack<Integer> data=new Stack<>();
	public Queue<Integer> interLeave(Queue<Integer> queue){
		int size=queue.size();
		int i=0;
	while(i!=size/2)
	{
		data.push(queue.remove());
		i++;
	}
	int m=0;
	while(m!=size/2)
	{
		queue.add(data.pop());
		m++;
	}
	//System.out.println(queue);
	int j=0;
	while(j!=size/2)
	{
		queue.add(queue.remove());
		j++;
	}
	int k=0;
	while(k!=size/2){
		data.push(queue.remove());
		k++;
	}
	while(!data.isEmpty()){
		queue.add(data.pop());
		queue.add(queue.remove());
	}
	return queue;
	}
	
	

	public static void main(String[] args) {
		InterLeaveQueue q=new InterLeaveQueue();
		 Queue<Integer> queue=new LinkedList<>();
		 queue.add(1);
		 queue.add(2);
		 queue.add(3);
		 queue.add(4);
		 queue.add(5);
		 queue.add(6);
		 System.out.println(queue);
		 queue=q.interLeave(queue);
		 System.out.println(queue);

	}

}
