package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface J
{
	void test(int i);
}

public class M7 
{
	public static void main(String[] args) 
	{
		J j1= (int x)->System.out.println("from test");
			
		j1.test(10);
		
		System.out.println("done");
	}
}


// ths x can be used method body staright away.