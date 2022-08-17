package conduira.task;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTask {


	public static void main(String args[]){
	PriorityQueue <Integer> queue=new PriorityQueue <Integer>(); 
	queue.add(1);                             
	queue.add(4);
	queue.add(7);
	queue.add(9);
	queue.add(6);
	queue.add(3);
	System.out.println("the queue elements:");
	Iterator<Integer> itr=queue.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
	System.out.println("the two elements that are removing are: ");
	System.out.println(queue.remove());
	System.out.println(queue.remove());
	System.out.println("remaining elements after removing two elements:");
	Iterator <Integer> itr2=queue.iterator();
	while(itr2.hasNext()){
	System.out.println(itr2.next());
	}
	}
	

}
