package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M13 
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
		
		while (it.hasNext())
		{
			System.out.print(it.next()+"' ");
		}
		list.add(100);   
		System.out.println();
		System.out.println(list);
	}
}
/*

before adding into the arraylist we are iterating each and every element.







*/
