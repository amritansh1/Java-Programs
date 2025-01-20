package Practice;

public class Snippet {
	public static void main(String args[]) {
	char A1[] = {'b','c','d','f','g','b','v','f'};
	
	char arr[]=new char[A1.length];
	
	int index=0;
	for(int i=0; i<A1.length; i++){
		
			if(A1[i]!=arr[i]){
				arr[index++]=A1[i];
			}
		
	}
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	}
}
