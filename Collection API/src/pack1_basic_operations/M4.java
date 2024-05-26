package pack1_basic_operations;

import java.util.ArrayList;

public class M4 
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
		System.out.println(list.contains("abc"));
		System.out.println(list.contains(9000000));
		System.out.println(list);
	}
}
/*
it checks particular elements is already available or not
if available it return true
if not available it return false

*/