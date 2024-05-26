package pack2_;

import java.util.ArrayList;
import java.util.Collections;

class Z implements Comparable<Z>
{
	int i;
	Z(int i)
	{
		this.i =i;
	}
	@Override
	public String toString() {
		
		return "i = "+i;
	}
	@Override
	public int compareTo(Z o) {
		
		return i-o.i;
	}
}
public class M42 
{
	public static void main(String[] args) {
		ArrayList<Z> L =new ArrayList<Z>();
		L.add(new Z (90));
		L.add(new Z (9));
		L.add(new Z (0));
		L.add(new Z (190));
		System.out.println(L);
		Collections.sort(L);
		System.out.println(L);
		
	}

}
