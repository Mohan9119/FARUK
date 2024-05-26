package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M19 
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
		ListIterator it= list.listIterator();
		Object obj;
		while (it. hasNext())
		{
			obj=it.next();
			if (obj.equals(910))
			{
				it.set(300);
			}
			System.out.print(it.next()+"' ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println(list);
	}
}
/*

while iterating element from list iterator if any element is 910
that is replacing with 300.
that replacement happening in the array itself.

iterator and listiterator both are pointing to arraylist only.

we can call set method in order to replace the iterator element.







*/
