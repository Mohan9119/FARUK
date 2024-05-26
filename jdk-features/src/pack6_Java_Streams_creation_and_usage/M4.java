package pack6_Java_Streams_creation_and_usage;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class M4 
{
	public static void main(String[] args) 
	{
		int[] elements = {10,20,30,50,110 };
		IntStream intstream =Arrays.stream(elements);
		intstream.forEach(System.out::println);
		System.out.println("----------");
		double[] heights = {4.5,5.9,6.1,5.7};
		DoubleStream doublestream=Arrays.stream(heights);
		doublestream.forEach(System.out::println);
	}
}
