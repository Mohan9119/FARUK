package pack1_basic_operations;

import java.util.ArrayList;
import java.util.Iterator;

public class M15 
{
	public static void main(String[] args) {
		ArrayList L1 =new ArrayList();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		System.out.println(L1);
		for( Object obj : L1 )
		{
			System.out.println(obj);
		}
	}
}

