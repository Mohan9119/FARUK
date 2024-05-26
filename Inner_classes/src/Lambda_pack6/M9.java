package Lambda_pack6;

interface A11
{
	void test(int i,String s1);
}
public class M9 
{
	public static void main(String[] args) {
		A11 a1 =(x,y)->
		{
			System.out.println("from test :"+x);
			System.out.println("from test :"+y);
			System.out.println("from test :"+y+"  from test :"+x);
		};
		a1.test(10, "abc");
		System.out.println("done");
		
	}
}


/*
no need to specify data type 

*/