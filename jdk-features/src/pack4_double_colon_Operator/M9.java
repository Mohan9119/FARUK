package pack4_double_colon_Operator;

interface E
{
	void test1(int i);
}

public class M9 
{
	static  void m1(double i)
	{
		System.out.println("i am from m1 : "+i);
	}
	
	public static void main(String[] args) {
		E e1 = M9::m1;
		e1.test1(100);
		//e1.test1(100.0);
		
		
		
		E e2 = M8::m1;
		e2.test1(100);
		
		
	}
}


//