package pack6_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class M6 
{
	public static void main(String[] args) {
		ArrayList L =new ArrayList();
		L.add(900);
		L.add(901);
		L.add(100);
		L.add(990.0);
		L.add("400");
		L.add(904);
		System.out.println(L);
		Collections.sort(L);
		System.out.println(L);
	}
}
