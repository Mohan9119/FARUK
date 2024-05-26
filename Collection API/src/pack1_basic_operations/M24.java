package pack1_basic_operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class M24 extends ArrayList
{
	public static void main(String[] args) {
		M24 L1 =new M24();
		L1.add(90);
		L1.add(190);
		L1.add(910);
		L1.add(901);
		L1.add(290);
		L1.add(9);
		L1.add(590);
		L1.add(433);
		L1.add(123);
		L1.add(801);	
		L1.add(801);	
		System.out.println(L1);
		Collections.sort(L1);
		System.out.println(L1);
		
	}
}

