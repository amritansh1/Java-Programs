package ClassConcepts;


//class Counter2{
//	​
//	static int count=0;
//	Counter2(){​
//		count++;
//		System.out.println(count);
//		}
//}​
//public static void main(String args[]){​
//creating objects
//Counter2 c1=new Counter2();
//Counter2 c2=new Counter2();
//Counter2 c3=new Counter2();
//}​

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="JAVA";
//		String s2="";
//		for(int i=0; i<s1.length(); i++){
//			s2+=s1.charAt(i);
//			
//			System.out.println(s2);
//		}
//		

	
	
	String a ="Hi How Are You";
//	String b="iH woH erA uoY"


			String arr[]=a.split(" ");

			for(int i=0;i<arr.length; i++) {
				for(int j=arr[i].length()-1;j>=0;j--) {
					System.out.print(arr[i].charAt(j));
				}
				System.out.print(" ");
			}
//
//			for(int i=0; i<arr.length; i++){
//				for(int j=arr[i].length()-1; j>=0; j--){
//					System.out.print(arr[i].charAt(j));
//				}
//				System.out.print(" ");
//			}
			
	}

	
	

}
