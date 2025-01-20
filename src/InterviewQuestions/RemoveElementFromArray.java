package InterviewQuestions;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int value=removeElement(nums,val);
		System.out.println("Number of integers"+value);
		

	}
	public static int removeElement(int[] nums, int val) {
        int count=0;
        int last=nums.length-1;
        int temp=0;
        for(int i=0;i<=last;i++){
            if(nums[i]==val){
                if(i==nums.length-1){
//                    last--;
                }
                temp=nums[i]; 
                System.out.println("Print temp"+temp);
                nums[i]=nums[last];
                System.out.println("Print nums[i]"+nums[i]);
                nums[last]=temp;
                System.out.println("Print nums[last]"+nums[last]);
                for(int k=0;k<nums.length;k++)
                    System.out.print(nums[k]);
                last--;
                i--;
                count++;
            }
            System.out.println("Iteration"+i);
            System.out.println("Value of i="+i);
            System.out.println("Value of last="+last);
            System.out.println("Value of temp="+temp);
            System.out.println("Value of count="+count);
            for(int k=0;k<nums.length;k++)
            System.out.print(nums[k]);
                
        }
        System.out.println("Array");
        for(int k=0;k<nums.length;k++)
            System.out.print(nums[k]);
        return nums.length-count;
    }

}
