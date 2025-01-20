package StringQuestions;

public class Palindrone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcghdcba";
		Test t1 = new Test();
		if(t1.palindrone(str))
			System.out.println("True");
		else
			System.out.println("False");
		
		
		
	}

}

class Test{
	
	boolean palindrone(String input) {
		int i=0, j=(input.length()-1);
		while(i<j) {
			if(input.charAt(i)!=input.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}
}
