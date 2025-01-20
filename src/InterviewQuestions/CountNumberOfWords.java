package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hi there I am I hi is are there";
		String[] arr=s.split(" ");
		int count=0;
		Map<String, Integer> map1=new HashMap();
		boolean flag;
		for(int i=0;i<arr.length-1;i++) {
			flag=false;
//			if(map1.containsKey(arr[i])) {
//				count =map1.get(arr[i]);
//				map1.put(arr[i], ++count);
//			}
//			else
//				map1.put(arr[i], 1);
//			}
//			System.out.println(map1);
			for(int j=i+1;j<arr.length;j++) {
				if(map1.containsKey(arr[i])) {
					
				}else{
					map1.put(arr[i], 1);
				}
				if(arr[i].equals(arr[j])) {
					count =map1.get(arr[i]);
					map1.put(arr[i], ++count);
					flag=true;
					break;
					
				}
			}
//			if(flag==false) {
//				map1.put(arr[i], 1);
//			}
		
		}
		System.out.println(map1);
	
	}
	
}

