package Practice;

public class SwapVar {
	
	public static void main(String[] args) {
		STwo s1= new STwo();
		s1.swap(5, 8);
		System.out.println("Object is "+s1);
		
		
	}
	
}

class STwo{
	int var1, var2;
	void swap(int x, int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Values are "+x+" "+y);
	}
}
