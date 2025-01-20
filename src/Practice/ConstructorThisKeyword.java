package Practice;

public class ConstructorThisKeyword {

	
		// TODO Auto-generated method stub
		ConstructorThisKeyword(){
			this("Inside this");
		}
		ConstructorThisKeyword(String s){
			System.out.println("Inside 1 parameter");
		}
		public static void main(String[] args) {
			ConstructorThisKeyword obj1=new ConstructorThisKeyword();
		}
}
