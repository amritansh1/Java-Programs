package ClassConcepts;

public class CheckDefaultValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s1=new Solution();
		int[] arr= {-1,1,0,-3,3};
		s1.productExceptSelf(arr);

	}

}

class Solution {
    public int[] productExceptSelf(int[] nums) {
    	int[] arr=new int[nums.length];
        int product=1;
        int product2=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
            product*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(count>1){
                arr[i]=0;
            }
            else if(nums[i]==0){
                for(int j=0;j<nums.length;j++){
                    if(j!=i) {
//                    	System.out.println(nums[j]);
                    	product2*=nums[j];
                    }
                        
                }
                arr[i]=product2;
            }
                
            else
            arr[i]=product/nums[i];
            
            System.out.println(arr[i]);
        }
        return arr;
    }
}

