package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<String> hash = new HashSet();
			hash.add("Movie");						//To add data in hash set
			hash.add("Sports");
			hash.add("Series");
			System.out.println("Hash Set : "+hash);
			hash.remove("Movie");
			hash.remove(1);
			hash.remove(1);
			System.out.println("Hash Set : "+hash);
			
			Set<Integer> hashInt = new HashSet();
			hashInt.add(10);
			hashInt.add(5);
			hashInt.add(15);
			hashInt.add(null);						//Hashcode value for null is 0
			hashInt.add(2);
			hashInt.add(20);
			hashInt.add(10);
			System.out.println("Hash Set : "+hashInt);
			System.out.println(hashInt.contains(4));
			System.out.println(hashInt.size());
			System.out.println("Hashcode "+hashInt.hashCode());
			for(Integer h : hashInt) {
				System.out.println(h);
			}
	}

}
