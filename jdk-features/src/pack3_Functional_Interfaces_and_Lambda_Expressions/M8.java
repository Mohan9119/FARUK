package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface K
{
	void test(int i);
}

public class M8 
{
	public static void main(String[] args) 
	{
		K k1= (x)->System.out.println("from test : "+x);
			
		k1.test(10);
		
		System.out.println("done");
	}
}

