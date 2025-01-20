package InterviewQuestions;
//import java.io.*;
import java.util.*;

public class StringLexicograph_FirstLetterToUpperCase {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String : ");
        String A=sc.next();
        System.out.println("Enter 2nd String");
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length1=A.length();
        int length2=B.length();
        int len = length1+length2;
        System.out.println("Length of String 1 + String 2 - "+len);
        System.out.println();
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        // System.out.println(A.codePointAt(0));
        // A.replace
        
        String resA =A.substring(0, 1).toUpperCase()+A.substring(1);
        String resB =B.substring(0, 1).toUpperCase()+B.substring(1);
        System.out.println(resA+" "+resB);
    }
}

