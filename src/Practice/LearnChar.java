package Practice;
public class LearnChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println('c'-97);
//		String s = "dff";
//		s.rep
		String[] words = {"notapalindrome","racecar"};
		String result = firstPalindrome(words);
		System.out.println(result);
	}

	public static String firstPalindrome(String[] words) {
		// TODO Auto-generated method stub
		 String palindroneStr = "";
	        for(int i=0; i<words.length; i++){
	            palindroneStr = palindrone(words[i]);
	            if(!palindroneStr.equals("")){
	                break;
	            }
	                
	        }
	       return palindroneStr;
	}

	public static String palindrone(String str) {
		// TODO Auto-generated method stub
		 boolean flag = true;
		 int j =str.length()-1;
	        for(int i=0;  i<str.length()/2; i++){
	            
	                if(str.charAt(i)!=str.charAt(j)){
	                    flag = false;
	                    break;
	                }
	                j--;  
	            
	        }
	        System.out.println(flag);
	        if(flag==true)
	            return str;
	        else
	            return "";
	}


}
