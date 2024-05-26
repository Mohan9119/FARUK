package pack2_;
class Ta < X >
{
	void test(X arg)
	{
		
	}
}
public class M35 
{
	public static void main(String[] args) {
		Ta < ? >t1=null;
		t1 = new Ta < P >();
		t1.test(new P());
		
		Ta <Integer> t2 =null;
		t2 = new Ta<Integer>();
		t2.test(90);
		
		System.out.println("done");
	}
}


// test method is generic type we can't call test method with t1.