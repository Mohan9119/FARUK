package pack2_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Za 
{
	int i,j;
	Za(int i,int j)
	{
		this.i =i;
		this.j =j;
	}
	@Override
	public String toString() {
		
		return "( "+i+","+j + ")";
	}
}
public class M43 
{
	public static void main(String[] args) {
		ArrayList<Za> L =new ArrayList<Za>();
		L.add(new Za (90,10));
		L.add(new Za (9,0));
		L.add(new Za (0,190));
		L.add(new Za (901,20));
		L.add(new Za (190,400));
		System.out.println(L);
		Collections.sort(L,new Comparator<Za>() 
		{
			@Override
			public int compare(Za o1, Za o2) {
				
				return o1.i-o2.i;
			}
		});
		System.out.println(L);
		Collections.sort(L,new Comparator<Za>() 
		{
			@Override
			public int compare(Za o1, Za o2) {
				
				return o1.j-o2.j;
			}
		});
		System.out.println(L);
		
	}

}
