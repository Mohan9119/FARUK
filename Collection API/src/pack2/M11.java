package pack2;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class M11 
{	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{	
		PriorityQueue Q=new PriorityQueue();
		Q.add(990);
		Q.add(null);
		Q.add(1190);
		Q.add(905);
		
		System.out.println(Q);
		
	}
}

/*
condition 1
where ever sorting is there you should provide same type element.
condition 2
where ever sorting is there you can't go for null point.

*/