package pack10_Collection_API_improvements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class M1 
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
		
		Iterator<Integer> it= L.iterator();
		/*
		Consumer<Integer> c1=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};*/
		//it.forEachRemaining(c1);
		System.out.println("------------------");
		it.forEachRemaining(element ->System.out.println(element));
		System.out.println("------------------");
		it.forEachRemaining(System.out::println);
	}
	
	
}
