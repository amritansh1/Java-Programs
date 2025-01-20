package Practice;
import java.util.Arrays;

public class CheckArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,53,33,14,14,67};
		Arrays.sort(arr);
		int diff=arr[arr.length-1]-arr[0];
		System.out.println(diff);

	}

}