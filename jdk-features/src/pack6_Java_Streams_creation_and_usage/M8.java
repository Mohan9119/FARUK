//usage
package pack6_Java_Streams_creation_and_usage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M8 
{
	public static void main(String[] args) {
		List<Integer> L=new ArrayList<Integer>();
		L.add(90);
		L.add(45);
		L.add(20);
		L.add(190);
		L.add(15);
		L.add(85);
		System.out.println(L);
		Stream<Integer> stream =L.stream();
		/*
		List<Integer> results1=stream.filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {return t<50;}
		}).collect(Collectors.toList());
		
		*/
		List<Integer> results1= stream.filter(t->t<50).collect(Collectors.toList());
		System.out.println(results1);
		
		Stream<Integer> stream2 =L.stream();
		List<Integer>results2 = stream2.filter(t->t%2==0).collect(Collectors.toList());
		System.out.println(results2);
		
		Stream<Integer> stream3 =L.stream();
		List<Integer>results3 = stream3.filter(t->t%2==1).collect(Collectors.toList());
		System.out.println(results3);
	}
}
