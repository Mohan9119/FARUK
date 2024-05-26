package Lambda_pack6;

interface A9
{
	void test(int i);
}
public class M7 
{
	public static void main(String[] args) {
		A9 a1 =(int x)-> System.out.println("from test: "+x);
		a1.test(10);
		System.out.println("done");
	}
}


// if method is supplying an args 

// while calling method we need supply value of x

