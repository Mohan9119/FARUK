package to_string_pack2;

class C
{
	int i;
	@Override
	public String toString() {
		
		return "i = "+i;
	}
}
class D
{
	int j;
	C c1;  // we using C class object and c1 attribute.
	@Override
	public String toString() {
		
		return "j = "+j+" , "+c1;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1=new C();
		c1.i=10;
		D d1=new D();
		d1.j=20;
		d1.c1=c1;
		System.out.println(c1);
		System.out.println(d1);
	}
}
