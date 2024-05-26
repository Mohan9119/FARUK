package pack5_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class M14 
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
		
		while (it.hasNext())
		{
			System.out.print(it.next()+", ");
		}
		System.out.println();
		System.out.println("-------------------");
		while(it.hasPrevious())
		{
			System.out.print(it.previous()+", ");
		}
		System.out.println();
		System.out.println(list);
	}
}
/*
inside a list iterator more methond are ther compared to iterator.
 public abstract boolean hasNext();
  public abstract E next();
  public abstract boolean hasPrevious();
  public abstract E previous();
  public abstract int nextIndex();
  public abstract int previousIndex();
  public abstract void remove();
  public abstract void set(E);
  public abstract void add(E);







*/
