package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class M5 
{
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("Hi");
		list.add("hello");
		list.add("Katham");
		list.add(" Bye");
		list.add("bye Bye");
		list.add("Good bye");
		list.add("654");
		list.add("7598454");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
