package InterviewQuestions;
import java.util.*;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate2 obj1=new RemoveDuplicate2();
		int arr[]= {1,1,1,2,2,3,3,2,4,5,4,4,4,7};
		System.out.println(obj1.removeDuplicates(arr));

	}

}

class RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int k=0;
        for(int i=0;i<nums.length-k;i++){
            if(i==0){
                count=1;
            }
            else if(nums[i]!=nums[i-1]){
                count=1;
            }else if(nums[i]==nums[i-1]&&count==1){
                count++;
            }
            else if(count==2&&nums[i]==nums[i-1]){
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                
                k++;
                i--;
            }
        }
        return nums.length-k;
    }
}
