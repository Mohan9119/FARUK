package Non_static_and_local_inner_classes_pack4;

public class M {
public static void main(String[] args) {
	class A
	{
		void test()
	{
		System.out.println("from A1 ");
		System.out.println("from A2 ");
		System.out.println("from A3 ");
		System.out.println("from A4 ");
	}
	}
	
		A a1=new A();
	a1.test();
	a1.test();
	a1.test();

	System.out.println("done");

}
}
