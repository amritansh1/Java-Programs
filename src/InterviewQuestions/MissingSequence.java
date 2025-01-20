package InterviewQuestions;

public class MissingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6,7,9};
		for(int i=1; i<=arr.length; i++) {
			if(arr[i-1]!=i) {
				System.out.println(i);
				break;
			}
		}
	}

}
