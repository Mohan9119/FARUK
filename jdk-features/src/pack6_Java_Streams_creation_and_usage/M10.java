package pack6_Java_Streams_creation_and_usage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class M10 
{
	public static void main(String[] args) 
	{
		List<Integer> L=new ArrayList<Integer>();
		L.add(90);
		L.add(45);
		L.add(20);
		L.add(190);
		L.add(15);
		L.add(85);
		System.out.println(L);
		
		List<Integer>r1=L.stream().map(t->(t-5)).collect(Collectors.toList());
		System.out.println(r1);
	}
}
