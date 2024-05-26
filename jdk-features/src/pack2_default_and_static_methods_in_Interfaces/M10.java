package pack2_default_and_static_methods_in_Interfaces;

abstract class J
{
	int i;
	J(int i)
	{
		this.i =i;
	}
	void test()
	{
		System.out.println("from test : "+i);
	}
}
class K extends J
{
	K(int i)
	{
		super(i);
	}
}

public class M10 
{
	public static void main(String[] args) {
		K k1 =new K(90);
		K k2 =new K(190);
		k1.test();
		k2.test();
		System.out.println("done");
		
	}
}

/*
this type of changes not allowed in case of 



*/
