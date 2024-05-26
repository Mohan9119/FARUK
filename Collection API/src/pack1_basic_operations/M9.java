package pack1_basic_operations;

import java.util.ArrayList;

public class M9 
{
	public static void main(String[] args) {
		ArrayList L1 =new ArrayList();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		System.out.println(L1);
		ArrayList L2 =new ArrayList();
		L2.add("abc");
		L2.add(900);
		L2.add(true);
		L2.addAll(L1);
		System.out.println(L1);
		System.out.println(L2);
	}
}

// all elements of L1 is copying L2.