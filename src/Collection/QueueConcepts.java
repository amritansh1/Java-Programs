package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList();
		queue.offer("Ironman");					
		queue.offer("Thor");					//To add values in queue
		queue.add("Captain America");			//To add values in queue, This will call offer method
		queue.offer("Ironman");
		queue.offer("Hulk");
		System.out.println("Queue is : "+queue);
		//add () method throws exception  java.lang.IllegalStateException: Queue full , at the moment queue is full, 
		//whereas the offer() method returns a Boolean value false for the same in case the queue is of restricted capacity.
		System.out.println("Element at peak of queue : "+queue.peek());
		String pollElement = queue.poll();
		System.out.println("Polled element from queue : "+pollElement);
		System.out.println("Queue is : "+queue);
	
	}

}
