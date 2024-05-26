package pack1_basic_operations;

import java.util.ArrayList;

public class M2 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(909);
		list.add("abc");
		list.add(909);
		list.add(true);
		list.add(909);
		list.add('t');
		System.out.println(list);
		list.add(2,"vijay");
		System.out.println(list);
	}
}
/*
at second index vijay inserted 909 is moved to right side .


*/