package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface L
{
	void test(int i,String s1);
}

public class M9 
{
	public static void main(String[] args) 
	{
		L l1= (x,y)->
				{
					System.out.println("from test : "+x);
					System.out.println("from test : "+y);
				};
			
		l1.test(10,"abc");
		
		System.out.println("done");
	}
}

