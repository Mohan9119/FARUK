package pack2_;
class Pa < X >
{
	X obj;
}
public class M31 
{
	public static void main(String[] args) {
		Pa < ? super Number >p1=null;
		p1 = new Pa < Integer >();
		p1 = new Pa< String >();
		System.out.println("done");
	}
}
