package Non_static_and_local_inner_classes_pack4;

public class E {
	class B
	{
		
	}
	static class C
	{
		
	}
	public static void main(String[] args) {
		E e1=new E();
		B b1= e1.new B();
		C c1=new C();
		System.out.println("done");
	}
}
