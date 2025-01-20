package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> priority = new PriorityQueue();
		priority.offer("Superman");
		priority.offer("Batman");
		System.out.println("Priority Queue is : "+priority);
		priority.offer("Amhnhnefd");
		System.out.println("Priority Queue is : "+priority);     //It maintains using minHeap 
		System.out.println("Peeked element : "+priority.peek());
		priority.poll();
		System.out.println("Priority Queue is : "+priority);
		
		Queue<Integer> priorityInt = new PriorityQueue();
		priorityInt.offer(10);
		priorityInt.offer(7);
		priorityInt.offer(4);
		priorityInt.offer(12);
		System.out.println("\nPriority Queue is : "+priorityInt);
		System.out.println("Peeked element : "+priorityInt.peek());
		priorityInt.poll();
		System.out.println("Priority Queue is : "+priorityInt); //It maintains using minHeap
		
	}

}
