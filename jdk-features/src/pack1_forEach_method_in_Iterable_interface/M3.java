package pack1_forEach_method_in_Iterable_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class M3 
{
	public static void main(String[] args) {
		ArrayList<Integer> L= new ArrayList<>();
		L.add(123);
		L.add(1000);
		L.add(15);
		L.add(45);
		L.add(345);
		L.forEach(new Consumer<Integer>()
				{
					public void accept(Integer obj) {
						System.out.println("consuming : "+ obj);
					}
				});
	}
	
}


