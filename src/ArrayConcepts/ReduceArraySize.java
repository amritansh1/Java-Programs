package ArrayConcepts;

public class ReduceArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		for(int i:arr) {
			if(i==2)
				arr=new int[arr.length-1];
		}
		for(int j:arr)
			System.out.println(j);
	}

}
