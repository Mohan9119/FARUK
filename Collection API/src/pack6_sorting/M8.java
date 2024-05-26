package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;

class A
{
	int i;
	A (int i)
	{
		this.i=i;
	}
	public String toString() {
		return "i= "+i;
		
	}
}
public class M8 
{
	public static void main(String[] args) {
		ArrayList L =new ArrayList();
		L.add(new A(90));
		L.add(new A(9));
		L.add(new A(0));
		L.add(new A(80));
		System.out.println(L);
		Collections.sort(L);
		System.out.println(L);
	}
}

//class a is not sub class to comparable and also we are not supply 
//comparator object separately.