package pack6_Java_Streams_creation_and_usage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M13 
{
	public static void main(String[] args) 
	{
		List<Integer> L= new ArrayList<Integer>();
		
		for (int i=1; i<=100;i++)
		{
			L.add(i);
		}
//		Stream<Integer> stream1=L.stream().filter(element->element %2==0);
//		stream1.forEach(System.out::println);

		
		Stream<Integer> stream2=L.parallelStream().filter(element->element %2==0);
		stream2.forEach(System.out::println);
		
	}
}
//1)this type stream is called as a sequential stream
//2)this type stream is called as a sequential stream

