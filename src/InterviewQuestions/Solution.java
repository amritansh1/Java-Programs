package InterviewQuestions;
class Solution {
    public String firstPalindrome(String[] words) {
        String palindroneStr = "";
        for(int i=0; i<words.length; i++){
            palindroneStr = palindrone(words[i]);
            if(!palindroneStr.equals("")){
                break;
            }
                
        }
       return palindroneStr;
    }
    
    public String palindrone(String str){
        boolean flag = true;
        for(int i=0; i<str.length()/2; i++){
            for(int j=str.length()-1; j>str.length()/2; j--){
                if(str.charAt(i)!=str.charAt(j)){
                    flag = false;
                    break;
                }
                    
            }
        }
        if(flag==true)
            return str;
        else
            return "";
    }
}
