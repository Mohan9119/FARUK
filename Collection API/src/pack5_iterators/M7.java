package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M7 
{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		Iterator it= list.iterator();
		Object obj;
		while(it.hasNext())
		{
			obj=it.next();
			System.out.print(obj+", ");
			if (obj.equals(190))
			{
				it.remove();
			}
		}
		System.out.println();
		System.out.println(list);
	}
}

