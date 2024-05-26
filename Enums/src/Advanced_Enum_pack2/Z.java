package Advanced_Enum_pack2;

public class Z 
{
	enum B
	{
		CON1(10),CON(30),CON4(50);
		int i;
		B(int i)
		{
			this.i=i;
		}
	}
	public static void main(String[] args) {
		B b1=B.CON4;
		System.out.println(b1);
		System.out.println(b1.i);
		B b2 =B.CON;
		System.out.println(b2);
		System.out.println(b2.i);
	}
}

//in a enum con1 its 1 constant,it is a type of object.

//while loading con1 10 is assing to i and 
//that i is loading to goble i.

//

