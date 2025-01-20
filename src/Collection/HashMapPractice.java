package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asdjfhsjkfa";
		int value=0;
		Map<Character,Integer> count=new HashMap();
		for(int i=0;i<s.length();i++) {
			if(count.containsKey(s.charAt(i))) {
				value=count.get(s.charAt(i));
				count.put(s.charAt(i), ++value);
			}else {
				count.put(s.charAt(i), 1);
			}
		}
		for(Character key: count.keySet()) {
			System.out.println(key);
		}
		
		for(Integer i: count.values()) {
			System.out.println(i);
		}
		System.out.println(count);
	}

}
