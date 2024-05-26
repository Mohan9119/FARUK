package pack3_Functional_Interfaces_and_Lambda_Expressions;

interface O
{
	int sum(int i, int j);
}

public class M12 
{
	public static void main(String[] args) 
	{
		O o1= (i,j)->i+j;
				
		int i=o1.sum(10,20);
		
		System.out.println("done with: "+i);
	}
}
