package Anonymous_inner_class_pack5;

public class M5 {
	public static void main(String[] args) {
		A a1 =new A()
				{
					void test1()
					{
						System.out.println("AIC.test1()");
					}
					void test2()
					{
						System.out.println("AIC.test2()");
					}
					void test3()
					{
						System.out.println("AIC.test3()");
					}
				};
				a1.test1();
				a1.test2();
				a1.test3();
	}
}

/*
 # inside class A there is no test3 but test3 is in anonymous
  test3 is not called by a1.
  
 
 
 */




