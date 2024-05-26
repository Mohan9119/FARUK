package pack5_forEach_in_detailed;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class M1 
{
	public static void main(String[] args) {
		List<Integer> L = new ArrayList<Integer>();
		L.add(100);
		L.add(10);
		L.add(130);
		L.add(300);
		L.add(125);
		System.out.println(L);
		for(Integer obj: L)
		{
			System.out.println(obj + ", ");
		}
		System.out.println(L);
		Consumer<Integer> consumers = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) 
			{
				System.out.println(t+", ");
			}
		};
		L.forEach(consumers);
		L.forEach(element ->System.out.println(element+" , "));
		System.out.println();
		L.forEach(System.out::print);
		System.out.println();
		L.forEach(System.out::println);
	}
}
