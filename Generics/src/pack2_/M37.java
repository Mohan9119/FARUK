package pack2_;
class V < T >
{
	T obj;
}
public class M37 
{
	static void test(V < ? > args)
	{
		
	}
	public static void main(String[] args) {
		test( new V < Integer >());
		test( new V < String >());
		test( new V < Object >());
		
		 
		 System.out.println("done");
	}
}


//