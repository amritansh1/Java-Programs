package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcepts {

	public static void main(String[] args) {
		Map<String, String> mapData = new TreeMap();
		mapData.put("Num1", "abc");
		mapData.put("Num2", "pqr");
		mapData.put("Num3", "xyz");
		
		System.out.println("Hash Map : "+mapData);
		mapData.put("Num3", "lmn");
		System.out.println("Hash Map : "+mapData);     //It overrides if same key used again
		
		mapData.putIfAbsent("Num3", "poi");		       //Only puts data in map if key is absent
		System.out.println("Hash Map : "+mapData);    
		System.out.println(mapData.containsKey("Num1"));
		
		for(String key: mapData.keySet()) {				//For each loop
			System.out.println(key);
		}
		
		for(String value: mapData.values()) {			//For each loop
			System.out.println(value);
		}
		
		for(Map.Entry<String, String> entity: mapData.entrySet()) {
			System.out.println(entity);					//For both keys and values
		}
		
		for(Map.Entry<String, String> entity: mapData.entrySet()) {
			System.out.print(entity.getKey()); 		//For keys
			System.out.println(entity.getValue()); 		//For value
		}
		System.out.println(mapData.containsValue("pqr"));
		mapData.remove("Num3");							//To remove key value pair
		System.out.println("Hash Map : "+mapData);  
	}
}
