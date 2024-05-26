package pack2_;

class J < X >
{
	X obj;
}
public class M25 
{
	public static void main(String[] args) {
		J < ? extends Number >j1 =null;
		j1=new J < P>();
		j1=new J <String>();
		j1=new J <Object>();
		System.out.println("done");
	}
}
