package pack6_Java_Streams_creation_and_usage;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class M5 
{
	public static void main(String[] args) 
	{
		Integer[] elements = {10,20,30,50,110 };
		Stream<Integer> stream1=Arrays.stream(elements);
		stream1.forEach(System.out::println);
		System.out.println("----------");
		
		
		Double[] heights = {4.5,5.9,6.1,5.7};
		Stream<Double> stream2= Arrays.stream(heights);
		stream2.forEach(System.out::println);
		System.out.println("-----------");
		
		String [] names = {"abc", "hello","test"};
		Stream<String> stream3 = Arrays.stream(names);
		stream3.forEach(System.out:: println);
	}
}
