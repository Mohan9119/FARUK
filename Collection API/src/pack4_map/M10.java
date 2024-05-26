
package pack4_map;

import java.util.Hashtable;


public class M10 
{
	public static void main(String[] args) {
		Hashtable table= new Hashtable();
		table.put("abc", 3443);
		table.put(null, true);
		table.put("abc2", 'a');
		table.put( true,4.5);
		System.out.println(table);
		
		
	}
}


