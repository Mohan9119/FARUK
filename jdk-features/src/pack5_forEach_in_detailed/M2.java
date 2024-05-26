package pack5_forEach_in_detailed;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class M2 
{
	public static void main(String[] args) {
		Map<Integer, String> M= new HashMap<Integer, String>();
		M.put(1,"abc");
		M.put(2,"xyz");
		M.put(3,"test");
		M.put(4,"hello");
		M.put(5,"java");
		System.out.println(M);
		BiConsumer<Integer, String> biconsumer=new BiConsumer<Integer, String>() {
			
			@Override
			public void accept(Integer t, String u) {
				System.out.println(t+" : "+u);
			}
		};
		M.forEach(biconsumer);
		
		M.forEach((k,v)->System.out.println(k+", "+v));
		//M.forEach(System.out::println);
	}
}
