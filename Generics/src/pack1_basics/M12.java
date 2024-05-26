package pack1_basics;

class L <x>
{
	x obj;
	x test()
	{
		return obj;
	}
}
public class M12 
{
	public static void main(String[] args) {
		L<Integer> l1=new L<Integer>();
		L<String> l2=new L<String>();
		L<Double> l3=new L<Double>();
		
		Integer obj1=l1.test();
		String obj2= l2.test();
		Double obj3= l3.test();
		System.out.println("done");
		
	}
}

/*
if your not providing any value 


*/