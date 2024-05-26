package pack1_basic_operations;

import java.util.ArrayList;
import java.util.Iterator;

public class M19 
{
	public static void main(String[] args) {
		ArrayList L1 =new ArrayList();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		System.out.println(L1);
		Boolean b1=L1.remove(new Integer(901));
		Boolean b2=L1.remove(new Integer(901));
		System.out.println(L1);
		System.out.println(b1);
		System.out.println(b2);
	}
}

