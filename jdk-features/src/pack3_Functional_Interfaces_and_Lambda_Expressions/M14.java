package pack3_Functional_Interfaces_and_Lambda_Expressions;

@FunctionalInterface
interface P
{
	int sum(int i, int j);
}

public class M14 
{
	public static void main(String[] args) 
	{
		P p1= (i,j)->i+j;
				
		int i=p1.sum(10,20);
		
		System.out.println("done with: "+i);
	}
}
