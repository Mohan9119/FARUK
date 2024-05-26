package pack3_set;

import java.util.HashSet;

class A
{
	int i;
	A (int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		return "(i="+i+")";
	}
	@Override
	public int hashCode() {
		return i;
	}
	@Override
	public boolean equals(Object obj) {
		return i==((A)obj).i;
	}
}
public class M1 
{
	public static void main(String[] args) {
		HashSet set =new HashSet();
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		set.add(new A(90));
		System.out.println(set);
	}
	
}
