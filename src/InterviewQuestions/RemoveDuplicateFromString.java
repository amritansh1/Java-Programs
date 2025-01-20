package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="dgAmritansnhashashw";
		s1=s1.toLowerCase();
		Set<Character> set=new HashSet();
		for(int i=0;i<s1.length();i++) {
			set.add(s1.charAt(i));
		}
		System.out.println(set);
		String s2="";
		boolean flag;
//		System.out.println(flag);
		for(int i=0;i<s1.length();i++) {
//			System.out.println("Value of i"+i);
			flag=true;
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				s2+=s1.charAt(i);
//				System.out.println(s2);
			}
		}
		System.out.println("String s2="+s2);
		
		String s3="mdhAmritansnhashashwa";
		for(int i=0;i<s3.length();i++) {
			boolean flag2=false;
			for(int j=i-1;j>=0;j--) {
				if(s3.charAt(i)==s3.charAt(j))
					flag2=true;
					
			}
			if(flag2==false)
			System.out.print(s3.charAt(i));
		}
		System.out.println('A'=='a');
		System.out.println('a'=='A');
		
		String s5="sdAba";
				System.out.print(s5.charAt(2)==s5.charAt(4));
		System.out.print(s5.charAt(4)==s5.charAt(2));
		
	}

}
