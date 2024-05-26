package Lambda_pack6;

interface A6
{
	void test();
}
public class M5 {
	public static void main(String[] args) {
		A6 a1=()-> System.out.println("from test");
		a1.test();
		System.out.println("done");
	}

}


//in case of lambda expression straight away you can
//start implementation without providing about
//method name and method qualifiers(like ).

// single level 