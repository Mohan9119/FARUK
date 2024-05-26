package pack4_double_colon_Operator;

interface C
{
	void test1(int i,String j);
}

public class M7 
{
	static  void m1(int i, String j)
	{
		System.out.println("i am from m1 : "+i+" , "+j);
	}
	void m2(int i,String j)
	{
		System.out.println("i am from m2 : "+i+" , "+j);
	}
	public static void main(String[] args) {
		C c1 = M7::m1;
		c1.test1(100,"abc");
		
		C c2 =new M7():: m2;
		c2.test1(200,"xyz");
	}
}


//