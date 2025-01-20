package Collection;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> l1=new ArrayList<Character>();
		l1.add('a');
		l1.add('b');
		l1.add('c');
		l1.add('a');
		System.out.println(l1);
		l1.remove(Character.valueOf('a'));
		System.out.println(l1);
		
	}

}

