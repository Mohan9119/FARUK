package Non_static_and_local_inner_classes_pack4;

public class G {
	class B
	{
		
	}
	static class C
	{
		
	}
	public static void main(String[] args) {
	
		B b1=new G().new B();
		C c1=new G.C();
		System.out.println("done");
	}
}

// c is a static member this can access through G
//class object is creating to C class only.