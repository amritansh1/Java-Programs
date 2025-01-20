package StringQuestions;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="IceCreAm";
		String s1="aeiouAEIOU";
        String s3="";
        String s4=s;
        int last=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s1.contains(String.valueOf(s4.charAt(i)))){
                if(i<last){
                    for(int j=last;j>=0;j--){
                        if(s1.contains(String.valueOf(s4.charAt(j)))){
                        	System.out.println("j"+j);
//                            s3=s4.substring(0,i);
                            // +s.charAt(j)+s.substring(i+1,j)+s.charAt(i);
                            System.out.println(" test:"+s4.substring(0,i));
                            System.out.println(s4.charAt(j));
                            System.out.println(s4.substring(i+1,j));
                            System.out.println(s4.charAt(i));
                            System.out.println(s4.substring(j+1,s.length()));
                            s4=s4.substring(0,i)+s4.charAt(j)+s4.substring(i+1,j)+s4.charAt(i)+s4.substring(j+1,s.length());
                            System.out.println("s4="+s4);
                            last=j-1;
                            System.out.println("last"+last);
                            break;
//                            AceCreIm
//                            AcICreem
                        }
                    }
                }else
                    break;
            }
        }
        System.out.println("Final string="+s4);
	}

}
