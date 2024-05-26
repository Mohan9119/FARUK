package pack1_basic_operations;

import java.util.ArrayList;

public class M11 
{
	public static void main(String[] args) {
		ArrayList L1 =new ArrayList();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		System.out.println(L1);
		Object obj = L1.get(3);
		//Object obj = L1.get(30);
		System.out.println(obj);
	}
}
// it works based on length
