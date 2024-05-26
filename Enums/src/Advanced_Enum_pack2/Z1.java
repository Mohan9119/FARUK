package Advanced_Enum_pack2;

public class Z1 
{
	enum C
	{
		TI,T2,T3,T4,T5;
		void test()
		{
			System.out.println("from test ");
		}
	}
	public static void main(String[] args) {
		C c1=C.T3;
		c1.test();
		System.out.println("--------------------");
		
		C c2=C.T4;
		c2.test();
		System.out.println("--------------------");
		
	}
}


// test is a member of all constant 

//enum constant will be act as a object.


