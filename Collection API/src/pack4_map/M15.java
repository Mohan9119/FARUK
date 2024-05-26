package pack4_map;

import java.util.HashMap;
import java.util.TreeMap;

class A1 implements Comparable
{
	int i;
	A1(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		return "(" +i+")";
	}
	@Override
	public int compareTo(Object o) {
		return (i-((A1)o).i);
	}
}

public class M15 
{
	public static void main(String[] args) {
		HashMap map= new HashMap ();
		map.put(new A1(90),"test1");
		map.put(new A1(9),"test2");
		map.put(new A1(0),"test3");
		map.put(new A1(190),"test4");
		map.put(new A1(910),"test5");
		map.put(new A1(901),"test6");
		
		System.out.println(map);
		
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
		
	}
}


