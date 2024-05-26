package Anonymous_inner_class_pack5;

public class M6 {
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
						test3();
					}
					void test3()
					{
						System.out.println("AIC.test3()");
					}
				};
				a1.test1();
				a1.test2();
				
	}
}

/*
 # inside class A there is no test3 but test3 is in anonymous
  test3 is not called by a1.
  
  # you can't call test3 in oustside. We can call inside anonymous.
  we can refer test3 method only from the anonymous inner classs.
  
  #we can't refer test3 by a1.
  
 
 
 */




