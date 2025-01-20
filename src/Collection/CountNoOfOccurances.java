package Collection;

//import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shdchisjdhcbrcsd";
		HashMap <Character, Integer> count=new HashMap();
		for(int i=0; i<s.length(); i++) {
			if(count.containsKey(s.charAt(i))) {
				int j = count.get(s.charAt(i));
				count.put(s.charAt(i), ++j);
			}else {
				count.put(s.charAt(i), 1);
			}
		}
		System.out.println(count);
	}

}

