package Collection;

import java.util.Arrays;

public class ArraysClassConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8,9,12,14,16};
		System.out.println("Index of 5 is :"+Arrays.binarySearch(arr, 5));   //Binary search directly
		
		int[] arr2 = {4,3,6,8,4,5,12,4,4,6,84,32,1};
		Arrays.sort(arr);													//sort array directly using quick sort
		for(int i: arr) {
			System.out.println(i);
		}
		
		char[] arr3= {'a','b','c'};
		arr3[2] = 'z';
		arr3[1] = 'x';
		for(int i=0; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		System.out.println(arr3.toString());
//		System.out.println("Arr 3 : "+arr3);
		
		int[] arr1= {1,8,15,89,120};
		for(int i=0;i<arr1.length-1;i++) {
			arr1[i]=arr1[i+1];
		}
//		arr1[arr1.length]=null;
		System.out.println("arr1 ="+arr1[0]);
		for(int j:arr1) {
			System.out.println(j);
		}
		
		int i=7;
		i=i++;
		i=i--;
		System.out.println("Value of i"+i);
		
	}

}
