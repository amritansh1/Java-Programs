package InterviewQuestions;

public class ReverseOnlyAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "34test909gda@sdet!23pro";

		//		34tset909adg@teds!23orp

		//96
		//		112
		String f="";
		String s="";
//		System.out.println(s.length());
		String r="";
		for(int i=0;i<x.length();i++){
			
			if(x.charAt(i)<97||x.charAt(i)>122){

				if(s.length()!=0){

					r=reverse(s);
					System.out.println("Value of r"+r);
					f+=r;
					s="";
				}
				f+=x.charAt(i);
			}
			//for 
			if(x.charAt(i)>96&&x.charAt(i)<123){
				s+=x.charAt(i);
			}
		}
		System.out.println(f);
	}
	public static String reverse(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		return rev;
	}	
}
