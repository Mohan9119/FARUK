package pack10_Collection_API_improvements;

import java.util.ArrayList;
import java.util.List;

public class M3 
{
	public static void main(String[] args) 
	{
		List<Integer> L =new ArrayList<Integer>();
		L.add(90);
		L.add(80);
		L.add(70);
		L.add(60);
		L.add(50);
		L.add(40);
		L.add(30);
		L.add(20);
		L.add(10);
		System.out.println(L);
		System.out.println("------------------");
		
		L.replaceAll(c1->(c1+5));
		System.out.println(L);
	}
}
