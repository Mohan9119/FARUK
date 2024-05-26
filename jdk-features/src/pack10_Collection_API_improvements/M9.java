package pack10_Collection_API_improvements;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class M9 
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
		System.out.println(L);
		System.out.println("---------");
		Spliterator<Integer>it = L.spliterator();
		it.forEachRemaining(t1->System.out.println(t1));
		System.out.println(L);
	}
}


//by using this we can achive parallel and scequence iterator.
// it is mainly used for parallel itaration.