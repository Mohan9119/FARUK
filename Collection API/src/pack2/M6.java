package pack2;

import java.util.LinkedList;

public class M6 
{	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{	
		LinkedList L= new LinkedList();
		L.add(90);
		L.add(190);
		L.add(1190);
		L.add(1910);
		L.add(901);
		L.add(910);
		System.out.println(L);
		System.out.println(L.pollLast());
		System.out.println(L);
		System.out.println(L.pollLast());
		System.out.println(L);
	}
}

//removing sand reading last element