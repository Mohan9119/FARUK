package Non_static_and_local_inner_classes_pack4;

public class H {
	class B
	{
		
	}
	static class C
	{
		
	}
	public static void main(String[] args) {
	
		H.B b1= new H().new B();
		H.C c1=new H.C();
		System.out.println("done");
	}
}
