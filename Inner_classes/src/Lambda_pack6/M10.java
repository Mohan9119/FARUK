package Lambda_pack6;
interface A12
{
	int test();
}
public class M10 
{
	public static void main(String[] args) {
		A12 a1 = ()->200;
		int i=a1.test();
		System.out.println("done with: "+i);
	}
}


// if method body contain only return value then 
//return statement not allowed.straight away 
//specify the value return

//while implementing returning 