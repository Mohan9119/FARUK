package Non_static_and_local_inner_classes_pack4;

public class K {
	public static void main(String[] args) {
		class A
		{
			void test()
			{
				System.out.println("from A");
			}
		}
		A a1=new A();
		a1.test();
		System.out.println("done");
	}

}

/*
#A visibility with in the main method
 #A is not visible in outer main method we can 
 create object and call test method.
#if you want to achive inside a method body without
exposing to outside world we can develop like this.
*/