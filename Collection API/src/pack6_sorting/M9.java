package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;

class B implements Comparable
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	public String toString() {
		return "i= "+i;
	}
	@Override
	public int compareTo(Object o) {
		int results =i-((B)o).i;
		//System.out.println("comparing "+this+" and "+o+" with results : "+results);
		return results;
	}
}
public class M9 
{
	public static void main(String[] args) {
		ArrayList L =new ArrayList();
		L.add(new B(90));
		L.add(new B(9));
		L.add(new B(0));
		L.add(new B(80));
		System.out.println(L);
		Collections.sort(L);
		System.out.println(L);
	}
}

//class a is not sub class to comparable and also we are not supply 
//comparator object separately.