package pack2_;

import java.util.ArrayList;

public class M41 
{
	public static void main(String[] args) {
		ArrayList<Integer> L = new ArrayList<Integer>();
		L.add(90);
		L.add(910);
		L.add(190);
		L.add(901);
		System.out.println(L);
		int i= L.get(2);
		System.out.println(i);
	}
}



// in jdk 1.5 entire collection api is regenrated with generics 
//Arraylist class is changed with Generics type.
//we can call get method stright away.
//if you are not suppling integer then we require down casting to use get method.