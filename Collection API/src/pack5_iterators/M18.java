package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M18 
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
		it.add(100);
		while (it.hasNext())
		{
			System.out.print(it.next()+"' ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println(list);
	}
}
/*
we can add element after iterator using listiterator reference(it.add(100)).








*/
