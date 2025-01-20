package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="amritanshsha"
				+ "";
		System.out.println("Duplicate Elements in string");
		Set<Character> s1=new HashSet();
		for(int i=0; i<s.length()-1; i++) {
			for(int j=i+1; j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					s1.add(s.charAt(i));
//					System.out.println(s.charAt(i));
					break;
				}
				
			}
		}
		System.out.println(s1);
	}

}

