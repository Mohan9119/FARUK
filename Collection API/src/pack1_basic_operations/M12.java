package pack1_basic_operations;

import java.util.ArrayList;

public class M12 
{
	public static void main(String[] args) {
		ArrayList L1 =new ArrayList();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		System.out.println(L1);
		int i=(Integer)L1.get(2);
		System.out.println(i);
	}
}

// based on index