package pack1_basic_operations;

import java.util.ArrayList;

public class M3 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(909);
		list.add("abc");
		list.add(909);
		list.add(true);
		list.add(909);
		list.add('t');
		System.out.println(list);
		list.set(2,"vijay");
		System.out.println(list);
	}
}
/*
at second index vijay inserted at2 by replacing 909 which is in 2 index .


*/