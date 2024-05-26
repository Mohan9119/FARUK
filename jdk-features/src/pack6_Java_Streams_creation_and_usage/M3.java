package pack6_Java_Streams_creation_and_usage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class M3 
{
	public static void main(String[] args) {
		Map<Integer, String> M =new HashMap<Integer, String>();
		M.put(1, "Faruk");
		M.put(2, "babu");
		M.put(3, "siri");
		M.put(4, "sanju");
		M.put(5, "pranay");
		
		Stream<Entry<Integer, String>> stream1 = M.entrySet().stream();
		Stream<Integer> stream2 =M.keySet().stream();
		Stream<String> stream3= M.values().stream();
		
		stream1.forEach(System.out::println);
		System.out.println("-------");
		
		stream2.forEach(System.out::println);
		System.out.println("-------");
		
		stream3.forEach(System.out::println);
		
	}
}
