package pack1_forEach_method_in_Iterable_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class M1 
{
	public static void main(String[] args) {
		ArrayList L= new ArrayList();
		L.add("hello");
		L.add(1000);
		L.add(1.4);
		L.add(45);
		L.add(true);
		ListConsumer consumer =new ListConsumer();
		L.forEach(consumer);
	}
}

class ListConsumer implements Consumer
{

	@Override
	public void accept(Object t) {
		System.out.println("Consuming : "+t);
		
	}
	
}

