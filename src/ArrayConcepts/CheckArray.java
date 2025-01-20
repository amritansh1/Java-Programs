package ArrayConcepts;

public class CheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		int index=0;
		arr[index++]=5;
		arr[index++]=6;
		System.out.println("index="+index);
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
