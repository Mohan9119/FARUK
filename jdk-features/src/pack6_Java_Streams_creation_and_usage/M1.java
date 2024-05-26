package pack6_Java_Streams_creation_and_usage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class M1 
{
	public static void main(String[] args) {
		List<Integer> L =new ArrayList<Integer>();
		L.add(90);
		L.add(901);
		L.add(190);
		L.add(910);
		L.add(290);
		Stream<Integer> stream1 =L.stream();
		stream1.forEach(System.out :: println);
	}
}

// defining stream with all elements of arraylist
//then reading with the foreach.