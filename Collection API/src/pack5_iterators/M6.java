package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M6 
{
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list);
		Iterator it= list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+", ");
			it.remove();
		}
		System.out.println();
		System.out.println(list);
	}
}
