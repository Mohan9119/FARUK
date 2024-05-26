package Non_static_and_local_inner_classes_pack4;

public class A {
	class B
	{
		
	}
	static class C
	{
		
	}
	public static void main(String[] args) {
		A a1=null;
		B b1=null;
		C c1=null;
		System.out.println("done");
	}

}
// B is non static member of A
// C is static member of A
//inner class can be static and outer class can't be static.
