package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstOccuranceOfNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks";
		Map<Character, Integer> data=new HashMap();
		for(int i=0; i<s.length(); i++) {
			if(data.containsKey(s.charAt(i))) {
				data.put(s.charAt(i), data.get(s.charAt(i))+1);
			}else {
				data.put(s.charAt(i), 1);
			}
		
		}
		System.out.println("Map with occurance "+data);
		for(int i=0; i<s.length(); i++) {
			if(data.get(s.charAt(i))==1) {
				System.out.println("First character with one occurance: "+s.charAt(i));
				break;
			}
				
		}
	}

}
