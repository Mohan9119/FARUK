package Advanced_Enum_pack2;

enum V
{
	C1,C2,C3;
	V()
	{
		System.out.println("V()");
	}
}
public class W 
{
	public static void main(String[] args) {
		V v1= V.C3;
		System.out.println(v1);
	}
}
