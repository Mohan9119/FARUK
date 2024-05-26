package pack4_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class A2 implements Comparable
{
	int i,j;
	A2(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "(" +i+" , "+j+")";
	}
}
class SortBasedOnI implements Comparator
{
	@Override
	public int compare(Object o1,Object o2) {
		return ((A2)o1 ).i - ((A2)o2).i;
	}
}
class SortBasedOnJ implements Comparator
{
	@Override
	public int compare(Object o1,Object o2) {
		return ((A2)o1 ).j - ((A2)o2).j;
	}
}


public class M16 
{
	public static void main(String[] args) {
		HashMap map= new HashMap ();
		map.put(new A2(90,0),"test1");
		map.put(new A2(9,56),"test2");
		map.put(new A2(0,125),"test3");
		map.put(new A2(190,45),"test4");
		map.put(new A2(910,50),"test5");
		map.put(new A2(901,52),"test6");
		
		System.out.println(map);
		
		TreeMap map1 = new TreeMap(new SortBasedOnI());
		map1.putAll(map);
		System.out.println(map1);
		TreeMap map2 = new TreeMap(new SortBasedOnJ());
		map2.putAll(map);
		System.out.println(map2);
		
	}
}


