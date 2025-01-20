package ClassConcepts;

public class CheckVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		obj1.a=5;
		System.out.println("Inside main");
		obj1.check();
		

	}

}

class A{
	protected int a;
	int b;
	public void check() {
		System.out.println(a);
	}
}
