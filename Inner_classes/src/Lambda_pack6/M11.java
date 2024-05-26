package Lambda_pack6;

interface A13
{
	int test();
}
public class M11 
{
	public static void main(String[] args) {
		A13 a1 =()->{
			System.out.println("from test");
			return 200;
		};
		int i=a1.test();
		System.out.println("done with : "+i);
	}
}

/*
when ever your keeping {} then return statement is mandatory.
return keyword with a value.

*/