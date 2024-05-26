package pack2;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class M8 
{	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{	
		PriorityQueue Q=new PriorityQueue();
		Q.add(990);
		Q.add(690);
		Q.add(10);
		Q.add(890);
		Q.add(590);
		Q.add(690);
		Q.add(790);
		Q.add(490);
		Q.add(290);
		Q.add(190);
		Q.add(1000);
		System.out.println(Q);
		System.out.println(Q.poll());
		System.out.println(Q);
		System.out.println(Q.poll());
		System.out.println(Q);
	}
}

//reading and removing 1st element