package Basics_pack1;

class R
{
	enum En
	{
		C1,C2,C3,C4;
	}
}
public class S
{
	public static void main(String[] args)
	{
		R.En e1 =R.En.C4;
		R.En e2 =R.En.C2;
		System.out.println(e1);
		System.out.println(e2);
	}
}

// R.En means En should be refered through R.
//En is enum name R is a class which contain ennum.



