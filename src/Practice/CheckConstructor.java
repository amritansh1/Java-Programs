package Practice;

public class CheckConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B(5);

	}

}

class A{
	A(){
		System.out.println("Inside A 0 parameter");
	}
	A(int x){
		System.out.println("Inside A 1 parameter");
	}
	
}

class B extends A{
	B(){
		
//		this();
		super();
		System.out.println("Inside B 0 parameter");
	}
	B(int x){
//		super(4);
		System.out.println("Inside B 1 parameter");
	}
	
}

