package Practice;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=6;
		increase(a,b);
		System.out.println("A="+a+" B="+b);

	}
	public static void increase(int x, int y) {
		x=x+1;
		y=y+1;
		System.out.println("X="+x+" Y="+y);
		
	}

}

