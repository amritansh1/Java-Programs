package InterviewQuestions;

public class CheckPalindroneSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionPalindrone obj=new SolutionPalindrone();
		System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));

	}

}
class SolutionPalindrone {
	 public boolean isPalindrome(String s) {
	        // String str = s.replaceAll("[^a-zA-Z]", " ");  
	         
	        String s1="";
	        for(int i=0;i<s.length();i++){
	            if((s.charAt(i)<='z')&&(s.charAt(i)>='a')||(s.charAt(i)<='Z')&&(s.charAt(i)>='A')||(s.charAt(i)<='9')&&(s.charAt(i)>='0')){
	                s1+=s.charAt(i);
	            }
	        }
	        String s2=s1.toLowerCase();
	        int len=s2.length()-1;
	        boolean flag=true;
	        for(int j=0;j<s2.length()/2;j++){
	            if(s2.charAt(j)!=s2.charAt(len)){
	                flag=false;
	                break;
	            }
	            len--;
	        }
	        return flag;
	        
	    }
}

