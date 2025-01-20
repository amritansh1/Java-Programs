package Collection;

import java.util.Stack;

public class StackConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> book = new Stack();
		book.push("Think And Grow Rich");    			//To push element into Stack
		book.push("Rich Dad Poor Dad");
		book.push("Psychology of Money");
		System.out.println("Stack is : "+book);
		System.out.println(book.peek());				//To check the top element on Stack
		System.out.println("Pooped Value : "+book.pop());//To Pop values from Stack
		System.out.println("Stack is : "+book);			//To Print Stack
		System.out.println(book.peek());
	}

}
