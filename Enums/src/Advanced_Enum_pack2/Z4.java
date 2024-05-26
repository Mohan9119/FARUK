package Advanced_Enum_pack2;

public class Z4 
{
	enum F
	{
		t1, t2, 
		t3
		{
			void method1()
			{
				System.out.println("inner");
			}
		},t4,t5;
		void method1()
		{
			System.out.println("General");
		}
	}
	public static void main(String[] args) {
		F f1=F.t1;
		F f2=F.t2;
		F f3=F.t3;
		F f4=F.t4;
		F f5=F.t5;
		f1.method1();
		f2.method1();
		f3.method1();
		f4.method1();
		f5.method1();
	}
}


/*
t1,t2,t4,t5 --common method is excetuting

for  t3-we provided specific method so it is printing that 
method.
in side t3 ""constant specific class"" body is provided.

*/
