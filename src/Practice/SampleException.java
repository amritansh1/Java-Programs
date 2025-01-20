package Practice;

public class SampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50, b=0, c;
//		int c=a/b;
//		System.out.println("Value of C = "+c);
		try {
			c=a/b;
			System.out.println("Value of C = "+c);
		}
		catch(Exception e ) {
			System.out.println("Can't divide a number by zero");
		}
		finally {
			System.out.println("Inside finally");
		}
		try {
			throw new Exception("throw Exception");
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}
	}
	
	
}
