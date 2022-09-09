package implement;

import ch08.maps.HMap;

public class ImplementationMap {

	public static void main(String[] args) {
		
		HMap<Integer, String> map = new HMap<Integer, String>();
		map.put(1, "one");		
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		System.out.println(map.toString());
		
	}

}
