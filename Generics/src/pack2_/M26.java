package pack2_;

class K < X >
{
	X obj;
}
public class M26 
{
	public static void main(String[] args) {
		K< ? extends Q >k1=null;
		k1 = new K < Q >();
		k1 = new K < R>();
		k1 = new K < S >();
		k1 = new K < T >();
		System.out.println("done");
	}
}
