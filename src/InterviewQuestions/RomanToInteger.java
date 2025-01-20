package InterviewQuestions;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 obj1=new Solution1();
		String s1="MDCLXVI";
		int substringLength=obj1.romanToInt(s1);
		System.out.println(substringLength);

	}

}

class Solution1 {
    public int romanToInt(String s) {
        int count=0;;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                if(i!=s.length()-1){
                    if(s.charAt(i+1)=='V'){
                        count+=4;
                        i++;
                    }
                    else if(s.charAt(i+1)=='X'){
                        count+=9;
                        i++;
                    }
                    else
                        count+=1;
                }else
                    count+=1;
            }else if(s.charAt(i)=='V'){
                count+=5;
            }else if(s.charAt(i)=='X'){
                if(i!=s.length()-1){
                    if(s.charAt(i+1)=='L'){
                        count+=40;
                        i++;
                    }
                    else if(s.charAt(i+1)=='C'){
                        count+=90;
                        i++;
                    }else
                        count+=10;
                }else
                count+=10;
            }else if(s.charAt(i)=='L'){
                count+=50;
            }else if(s.charAt(i)=='C'){
                if(i!=s.length()-1){
                    if(s.charAt(i+1)=='D'){
                        count+=400;
                        i++;
                    }
                    else if(s.charAt(i+1)=='M'){
                        count+=900;
                        i++;
                    }else
                        count+=100;
                }else
                count+=100;
            }else if(s.charAt(i)=='D'){
                count+=500;
            }else if(s.charAt(i)=='M'){
                count+=1000;
            }
        }
        return count;
    }
}
