package pack1_basic_operations;

import java.util.ArrayList;

public class M14 
{
	public static void main(String[] args) {
		ArrayList L1 =new ArrayList();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		System.out.println(L1);
		for( int i=0; i < L1.size() ;i++)
		{
			System.out.println(L1.get(i));
		}
	}
}

