package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> arrayDeque = new ArrayDeque();
		arrayDeque.offer("Row1");
		arrayDeque.offer("Row2");
		arrayDeque.offerFirst("as");					//To add at first place
		arrayDeque.offerLast("RowLast");				//To add at last place
		System.out.println("ArrayDeque is : "+arrayDeque);
		
		System.out.println("Peek element : "+arrayDeque.peek());
		System.out.println("PeekFirst element : "+arrayDeque.peekFirst());
		System.out.println("PeekLast element : "+arrayDeque.peekLast());
		arrayDeque.poll();
		System.out.println("ArrayDeque after poll : "+arrayDeque);
		arrayDeque.pollLast();
		System.out.println("ArrayDeque after pollLast : "+arrayDeque);
		arrayDeque.pollFirst();
		System.out.println("ArrayDeque after pollFirst : "+arrayDeque);
	}

}