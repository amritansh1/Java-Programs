package InterviewQuestions;

public class SumDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]=new int[3][3];
		ABC a1=new ABC();
		int matrix[][]= {{1,2,3,5},{4,5,6,3},{7,8,9,2},{10,11,12,8}};
		System.out.println("Sum ="+a1.sum(matrix));

	}
}

class ABC{
	int sum(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==j||i+j==arr[i].length-1) {
					sum+=arr[i][j];
				}
			}
		}
		
		return sum;
	}
	

}
