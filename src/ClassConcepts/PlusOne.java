package ClassConcepts;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 obj1=new Solution1();
		int[] digits = {9,9};
		int[] arr1=obj1.plusOne(digits);
//		new int[obj1.plusOne(digits).length];
//		arr1=obj1.plusOne(digits);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
//
	}

}

class Solution1 {
    public int[] plusOne(int[] digits) {
        int last=digits.length-1;
        for(int i=last;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
