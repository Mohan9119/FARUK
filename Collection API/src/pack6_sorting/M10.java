package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class C 
{
	int i,j;
	C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString() {
		return "C{i= "+i+",j = "+j+"}";
	}
}
class SortBasedOnIValue implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((C)o1).i-((C)o2).i;
	}
}
class SortBasedOnJValue implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((C)o1).j-((C)o2).j;
	}
}
public class M10 
{
	public static void main(String[] args) {
		ArrayList L =new ArrayList();
		L.add(new C(10,20));
		L.add(new C(20,10));
		L.add(new C(5,15));
		L.add(new C(15,5));
		System.out.println(L);
		Collections.sort(L,new SortBasedOnIValue());
		System.out.println(L);
		Collections.sort(L,new SortBasedOnJValue());
		System.out.println(L);
	}
}
/*
Comparator is single method interface from java.util.package.
It also contains only 1 method that method name is compare method with 2 args.
it's second sort method takes 2 args 1st arg is container and 2 arg is comparator type.




*/