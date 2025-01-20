package InterviewQuestions;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,3};
		int result=majorityElement(nums);
		System.out.println(result);
	   
	}
	 public static int majorityElement(int[] nums) {
//	        int[] count=new int[nums.length];
//	        for(int i=0;i<nums.length;i++){
//	            count[i]=1;
//	        }
//	        for(int i=0;i<nums.length-1;i++){
//	            for(int j=i;j<nums.length;j++){
//	                if(nums[i]==nums[j])
//	                    count[i]++;
//	            }
//	        }
//	        int max=count[0];
//	        int maxIndex=0;
//	        for(int i=1;i<count.length;i++){
//	            if(count[i]>max){
//	                max=count[i];
//	                maxIndex=i;
//	            }
//	        }
//	        return nums[maxIndex];
//	    }
	 
	     int max1=1;
	     int maxInd=0;
	     for(int i=0;i<nums.length-1;i++){
	    	 	int count=1;
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j])
	                    count++;
	            }
	            if(count>max1) {
	            	max1=count;
	            	maxInd=i;
	            }
	            	
	        }
	     return nums[maxInd];
	 }

}

