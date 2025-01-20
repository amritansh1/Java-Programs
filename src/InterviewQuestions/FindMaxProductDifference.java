package InterviewQuestions;
class FindMaxProductDifference {
	public static void main(String args[]) {
		int nums[]= {1,6,7,5,2,4,10,6,4};
		 System.out.println(maxProductDifference(nums));
	}
    public static int maxProductDifference(int[] nums) {
        int max1=nums[0];
        int min1=nums[0];
        int max2=nums[0];
        int min2=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max1)
                max1=nums[i];
            if(nums[i]<min1)
                min1=nums[i];
        }
        System.out.println("max1: "+max1);
        System.out.println("min1: "+min1);
        if(nums[0]==max1)
        	max2=nums[1];
        if(nums[0]==min1)
        	min2=nums[1];
        for(int i=0;i<nums.length; i++){
            if((nums[i]==max1)||(nums[i]==min1))
                continue;
            else{
                if(nums[i]>max2)
                    max2=nums[i];
                if(nums[i]<min2)
                    min2=nums[i];
            }
        }
        System.out.println("max2: "+max2);
        System.out.println("min2: "+min2);
        return (max1*max2)-(min1*min2);
    }
}
