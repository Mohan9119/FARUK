package pack1_basic_operations;

import java.util.ArrayList;

public class M8 
{
	public static void main(String[] args) {
		ArrayList L1 =new ArrayList();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		System.out.println(L1);
		ArrayList L2 =new ArrayList(L1);
		System.out.println(L2);
	}
}

// all elements of L1 is copying L2.