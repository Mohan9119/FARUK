package to_string_pack2;

class A
{
	int i;
	@Override
	public String toString() {
		
		return " its a type object with i valu as:  "+i;
	}
}
public class M1 
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.i=20;
		System.out.println(a1);
		String s1 ="descl" +a1;
		System.out.println(s1);
		
	}
}
