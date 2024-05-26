package pack2_;
class O < X >
{
	X obj;
}
public class M30 
{
	public static void main(String[] args) {
		O < ? super Number >o1=null;
		o1 = new O < Object >();
		o1 = new O < Number >();
		System.out.println("done");
	}
}
