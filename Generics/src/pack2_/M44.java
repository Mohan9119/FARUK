package pack2_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Zb 
{
	int i,j;
	Zb(int i,int j)
	{
		this.i =i;
		this.j =j;
	}
	@Override
	public String toString() {
		
		return "( "+i+","+j + ")";
	}
}
public class M44 
{
	public static void main(String[] args) {
		ArrayList<Zb> L =new ArrayList<Zb>();
		L.add(new Zb (90,10));
		L.add(new Zb (9,0));
		L.add(new Zb (0,190));
		L.add(new Zb (901,20));
		L.add(new Zb (190,400));
		System.out.println(L);
		Collections.sort(L, ( o1, o2)-> o1.i -o2.i);
		System.out.println(L);
		Collections.sort(L,( o1, o2)-> o1.j -o2.j);
		System.out.println(L);
		
	}

}
