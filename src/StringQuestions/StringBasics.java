package StringQuestions;

public class StringBasics {

	public static void main(String[] args) {
		int array[]=new int[5];
		System.out.println(array);
		String str1 = "Learn Automation";
//		str1="abc";
		String str2 = "Learn Automation";
		if(str1==str2) {
			System.out.println("Reference of str1 = str2");
		}
		else {
			System.out.println("Reference of str1!=str2");
		}
		String str3 = new String("Learn automation");
		System.out.println("str3 ="+str3);
		System.out.println(str3.concat("Hello"));
		System.out.println("str3 ="+str3);
		str3.concat("Hello");
		System.out.println("str3 ="+str3);
		str3=str3.concat("Conc");
		System.out.println("str3 ="+str3);
		System.out.println();
		if(str1==str3) {
			System.out.println("Reference of str1 = str3");
		}
		else {
			System.out.println("Reference of str1!=str3");
		}
		
		String str4 = str1.concat(str2).concat(str3);
		System.out.println("str4 ="+str4);
		System.out.println("str4 length="+str4.length());
		str1 = str1.concat(str2).concat(str3);
		System.out.println("str1 ="+str1);
		
		if(str1==str4) {
			System.out.println("Reference of str1 = str4");
		}
		else {
			System.out.println("Reference of str1!=str4");
		}
//		int length= str4.length();
//		System.out.println(length);
		String[] str5 = str4.split(" ");
		for(int i=0; i<str5.length;i++) {
			System.out.println("Inside for lopp");
			System.out.println(str5[i]);
		}
		System.out.println("Traverse String using char array");
		char[] ch = str4.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println(" Reverse String using char array");
		char[] rev = str4.toCharArray();
		for(int j=rev.length;j>0;j--) {
			System.out.print(ch[j-1]);
		}
//		System.out.println("ch1 ="+ch[0]);
//		System.out.println("ch1 ="+ch[1]);
//		System.out.println("str5 ="+str5[0]);
//		System.out.println("str5 ="+str5[1]);
//		System.out.println("str5 ="+str5[2]);
//		System.out.println("str5 ="+str5[3]);
//		System.out.println("str2 ="+str2);
//		System.out.println("str1 ="+str1);
//		for(int j=str3.length();j>0;j--) {
//			System.out.print(str3[j]);
		str3=str3+"abc";
		System.out.println("str3 ="+str3);
//		
	}
	
}
