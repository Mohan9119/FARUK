package pack4_map;

import java.util.HashMap;

public class M2 
{
	public static void main(String[] args) {
		HashMap map1= new HashMap();
		map1.put(null, null);
		map1.put(null, "try");
		map1.put(345, "fine");
		map1.put(3.4, true);
		map1.put('a', null);
		System.out.println(map1);
		
	}
}
