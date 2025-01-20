package ClassConcepts;

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter2 c1=new Counter2();
		Counter2 c2=new Counter2();
		Counter2 c3=new Counter2();
	}

}

class Counter2{
	static int count=0;
	Counter2(){
		count++;
		System.out.println(count);
	}
}
