package Anonymous_inner_class_pack5;

public class M13 {
	public static void main(String[] args) {
		C c1=new C()
				{
					void test1() 
					{
						System.out.println("from AIC.test1()");
					}
				};
				c1.test1();
				c1.test2();
				System.out.println("done");
	}
}
