package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M12 
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
		list.add(101);
		
		while (it.hasNext())
		{
			System.out.print(it.next()+"' ");
		}
		System.out.println();
		System.out.println(list);
	}
}
/*
after getting iterator you should not do any updateable operation in
the arraylist.
if you it comes under concurrent modification

there are 2 types of iterators  avaible.
1)failpass and 2)failsafe itertors.
by default we get failpass itertors.it wont allow concurrent modification.
only failsafe iterators allow in concurrent iterators.

but we will get failsafe iterator only from concurrency concept.



*/
