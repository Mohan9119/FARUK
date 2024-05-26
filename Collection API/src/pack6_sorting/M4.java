package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class M4 
{
	public static void main(String[] args) {
		ArrayList L =new ArrayList();
		L.add("hi");
		L.add("hello");
		L.add("katham");
		L.add("bye");
		L.add("bye bye");
		L.add("good bye");
		System.out.println(L);
		Collections.sort(L);
		Collections.sort(L,Collections.reverseOrder());
		System.out.println(L);
	}
}
