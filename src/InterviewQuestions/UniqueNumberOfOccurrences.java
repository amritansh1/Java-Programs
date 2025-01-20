package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s1=new Solution2();
		int[] arr= {1,2,2,1,1,3};
		System.out.println(s1.uniqueOccurrences(arr));
	}

}

class Solution2 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m1=new HashMap();
        for(int i=0;i<arr.length;i++){
            if(m1.containsKey(arr[i])){
                m1.put(arr[i],m1.get(arr[i])+1);
            }
            else
                m1.put(arr[i],1);
        }
        int[] arrN=new int[m1.size()];
        int count=0;
        for(int i:m1.values()){
            arrN[count++]=i;
        }
        for(int k:arrN) {
        	System.out.println(k);
        }
        boolean flag=true;
        for(int i=0;i<arrN.length-1;i++){
            for(int j=i+1;j<arrN.length;j++){
                if(arrN[i]==arrN[j])
                    return false;
            }
        }
        return flag;
    }
}