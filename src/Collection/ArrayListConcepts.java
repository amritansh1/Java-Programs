package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListConcepts {

//	public static ArrayList<Integer> CreateFibonacci(int seriesLength){
//		if(seriesLength==0);
//		return 
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		ArrayList<String> list = new ArrayList();
		int n1=0;
		int n2=1;
		
		for(int i=0;i<n;i++) {
			
		}
//		ArrayList res = CreateFibonacci(5);
		list.add("Hello1");
		list.add("Hello2");
		list.add("Hello3");
		list.add("Hello4");
		list.add("Hello5");
		list.add("Hello6");
		System.out.println("List Values : "+list);
		System.out.println(list.get(1));           //To retrieve value at an index
		list.remove(3);								//To remove value from an index
		System.out.println("Updated list : "+list);
		list.remove(String.valueOf("Hello4"));		//TO remove some specific value
		System.out.println("List : "+list);
//		list.clear();								//To remove complete list 
		System.out.println("List :"+list);
		list.set(2, "Updated");						//To update value for at any particular index
		System.out.println("Size of list : "+list.size()); //To get size of List
		System.out.println("List : "+list);
		System.out.println(list.contains("Hello5")); // To check if list contains some specific value or not
		for(int i=0;i<list.size();i++) {
			System.out.println("Element at "+(i+1)+" index : "+list.get(i)); //To traverse list using for loop
		}
		for(String s:list) {
			System.out.println("Element is :"+s);	//ForEach loop
		}
		Iterator<String> it = list.iterator();		//Using Iterator 
		while(it.hasNext()) {
			System.out.println("Element using Iterator "+it.next());
		}
		
	}

}
