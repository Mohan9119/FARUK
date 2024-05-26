package Non_static_and_local_inner_classes_pack4;

public class F {
	class B
	{
		
	}
	static class C
	{
		
	}
	public static void main(String[] args) {
		
		B b1= new F().new B();
		C c1=new C();
		System.out.println("done");
	}
}

// if you want 1 time usage of F object .
//create F object with B object.