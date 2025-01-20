package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Set<Integer> treeSet = new TreeSet();
			treeSet.add(10);
			treeSet.add(5);							//For TreeSet values will be stored in form of BST
			treeSet.add(15);
			treeSet.add(2);
			treeSet.add(20);
			System.out.println("Tree Set : "+treeSet);
			System.out.println(treeSet.contains(4));
			System.out.println(treeSet.size());
			System.out.println(treeSet.hashCode());
			for(Integer h : treeSet) {
				System.out.print(h+" ");
			}
	}

}
