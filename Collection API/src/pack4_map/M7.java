
package pack4_map;

import java.util.HashMap;
import java.util.Set;

public class M7 
{
	public static void main(String[] args) {
		HashMap map1= new HashMap();
		map1.put("abc", 23344);
		map1.put(345, "try");
		map1.put(3.4, true);
		map1.put('a', "xyz");
		map1.put("test",456);
		System.out.println(map1);
		
		Set entries=map1.entrySet();
		for (Object entry : entries)
		{
			System.out.println(entry);
		}
		System.out.println(entries);
		
	}
}


