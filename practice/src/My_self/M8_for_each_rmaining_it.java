package My_self;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M8_for_each_rmaining_it 
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
		Consumer consumer=new Consumer()
		{
			@Override
			public void accept(Object t) {
				System.out.print(t+", ");
				
			}
		};
		it.forEachRemaining(consumer);
		System.out.println();
		System.out.println();
		System.out.println(list);
	}
}
/*
consumer also functional interface which is containing accept method only one abstract 
method that is accept method consumer type of object is reading.

this consumer type of object is supplied to iterator  for each remaining.

for each remaining

*/
