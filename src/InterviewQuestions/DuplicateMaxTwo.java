package InterviewQuestions;

public class DuplicateMaxTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateMax2 obj1=new DuplicateMax2();
		int[] nums= {1,1,1,2,2,3};
		System.out.println("sf");
		System.out.println(obj1.removeDuplicates(nums));

	}

}

class DuplicateMax2 {
    public int removeDuplicates(int[] nums) {
    	
    	System.out.println("nkvkdnvkd");
        int count=0;
        int k=0;
        for(int i=0;i<nums.length;i++) {
        	System.out.println(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                count=1;
            }
            else if(nums[i]!=nums[i-1]){
                count=1;
            }else if(nums[i]==nums[i-1]&&count==1){
                count++;
            }
            else if(count==2&&nums[i]==nums[i-1]){
                for(int j=i;j<nums.length-2;j++){
                    nums[j]=nums[j+1];
                }
                k++;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++) {
        	System.out.println(nums[i]);
        }
        return nums.length-k;
    }
}
