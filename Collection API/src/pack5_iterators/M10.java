package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M10 
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
		
		it.forEachRemaining((o1)->System.out.print(o1+", "));
		System.out.println();
		System.out.println();
		System.out.println(list);
	}
}
/*
conusmer object maily for defining how we can consume elements of arrays.

this for each implemented in jdk 1.8
*/
