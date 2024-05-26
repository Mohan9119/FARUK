package pack2_;

import java.util.ArrayList;
import java.util.HashMap;

public class M46 
{
	static void test (ArrayList<?>L)
	{
		L.add(90);
	}
	public static void main(String[] args) {
		ArrayList<Integer> L =new ArrayList<Integer>();
		L.add(10);
		test(L);
		L.add(20);
		
		System.out.println(L);
	}

}
// list is wild card method 