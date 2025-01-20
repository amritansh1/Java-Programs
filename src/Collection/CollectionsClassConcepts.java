package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> serial = new ArrayList();
		serial.add(2);
		serial.add(4);
		serial.add(5);
		serial.add(1);
		serial.add(9);
		serial.add(8);
		serial.add(7);
		serial.add(2);
		System.out.println("Min : "+Collections.min(serial));
		System.out.println("Max : "+Collections.max(serial));
		System.out.println(serial);
		System.out.println("Frequency of 2 : "+Collections.frequency(serial, 2));
		
	}

}
