package Practice;

public class CheckTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
//		a=a/0;
		try {
			a=a/0;
		}
//		finally {
//			System.out.println("Inside finally");
//		}
		catch(Exception e) {
			System.out.println("Inside catch");
		}
//		finally {
//		System.out.println("Inside finally");
//	}

	}

}
