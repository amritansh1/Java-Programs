package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<String> hash = new LinkedHashSet();
			hash.add("Movie");						//To add data in hash set
			hash.add("Sports");
			hash.add("Series");
			System.out.println("Linked Hash Set : "+hash);
			hash.remove("Movie");
			System.out.println("Linked Hash Set : "+hash);
			
			Set<Integer> hashInt = new LinkedHashSet();
			hashInt.add(10);
			hashInt.add(5);							//For LinkedHAshSet values will be stored in the same order as entered
			hashInt.add(15);
			hashInt.add(null);						//Hashcode value for null is 0
			hashInt.add(2);
			hashInt.add(20);
			System.out.println("Linked Hash Set : "+hashInt);
			System.out.println(hashInt.contains(4));
			System.out.println(hashInt.size());
			System.out.println(hashInt.hashCode());
			for(Integer h : hashInt) {
				System.out.println(h);
			}
	}

}
