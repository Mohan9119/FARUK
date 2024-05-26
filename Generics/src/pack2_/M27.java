package pack2_;

class L < X >
{
	X obj;
}
public class M27 
{
	public static void main(String[] args) {
		L < ? extends Q >l1 =null;
		l1 =new L< P>();
		l1 =new L<Object>();
		l1 =new L<String>();
		System.out.println("done");
	}
}
//2 way of use wild card character.