package Lambda_pack6;

interface A14
{
	int sum(int i,int j);
}
public class M12 
{
	public static void main(String[] args) {
		A14 a1 =(i,j)->i+j;
		int i=a1.sum(10, 20);	
		System.out.println("done with : "+i);
	}
}

/*
only one method is there no need of data type.

no need of{} because only 1 statement is there.



*/