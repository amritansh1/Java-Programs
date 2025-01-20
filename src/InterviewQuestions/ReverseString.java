package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Amritansh");
		
		 System.out.println(s.reverse());
		 
		 StringBuffer s1 = new StringBuffer("Mishra");
			
		 System.out.println(s1.reverse());
		 
		 String s2="slfvnknjkf";
		 for(int i=s2.length()-1;i>=0;i--) {
			 System.out.print(s2.charAt(i));
		 }
		 
		 String s3 = "cekjccejk";
		 String s4="";
		 for(int i=s3.length()-1;i>=0;i--) {
			 s4+=s3.charAt(i);
		 }
		 System.out.print("\n"+s4);
		 
	}

}
