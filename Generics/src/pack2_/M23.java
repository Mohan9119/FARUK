package pack2_;

class H < X >
{
	X obj;
}
public class M23 
{
	static void test( H < ? >h1)
	{
		
	}
	public static void main(String[] args) {
		test( new H <Integer>());
		test( new H <Object>());
		test( new H <P>());
		test( new H <String>());
		test( new H <Thread>());
		System.out.println("done");
	}
}
