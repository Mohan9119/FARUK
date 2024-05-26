package Anonymous_inner_class_pack5;

public class M20 {
	public static void main(String[] args) {
		
		F.method1(new C()
				{
					 void test2()
					{
						System.out.println("from A.AIC.test1");
					}
					
				}
		);
		System.out.println("done");
	}

}

//






