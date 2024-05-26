package Advanced_Enum_pack2;

public class Z5 
{
	enum X
	{
		A,B,C,D;
	}
	public static void main(String[] args) {
		X x1=X.C;
		switch(x1)
		{
		case A:
		{
			System.out.println("in A");
			break;
		}
		case B:
		{
			System.out.println("in B");
			break;
		}
		case C:
		{
			System.out.println("in C");
			break;
		}
		case D:
		{
			System.out.println("in D");
			break;
		}
		}
		System.out.println("done");
	}
}

/*
if switch args is enum constant every case 
should be enum constant.

*/
