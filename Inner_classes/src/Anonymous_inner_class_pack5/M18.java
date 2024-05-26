package Anonymous_inner_class_pack5;

public class M18 {
	public static void main(String[] args) {
		E e1 =new E();
		e1.method1(new A()
				{
					void test1()
					{
						System.out.println("from A.AIC.test1");
					}
				}
		);
		System.out.println("done");
	}

}


//widely used in this type.
//devepoling inner class in the inline or inside a paranthasis()
//itself.

//while calling method1in the paranthasis itself 
//creating an object to that sub class supply that object to
//



