package Lambda_pack6;

interface A7
{
	void test();
}
public class M6 
{
	public static void main(String[] args) {
		A a1=()->{
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
		};
		a1.test();
		System.out.println("done");
	}
}

