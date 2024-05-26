package pack1;

class J
{
	@Deprecated
	void test1()
	{
		
	}
	void test2()
	{
		
	}
}
public class M16 
{

	@SuppressWarnings("deprected")
	public static void main(String[] args) {
		J j1=new J();
		j1.test1();
		j1.test2();
		System.out.println("done");
	}
}
