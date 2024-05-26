package pack2_;

class A < X extends R >
{
	X obj;
}
public class M16 
{	
	public static void main(String[] args) 
	{
		A< R > a1=new A< R >();
		A< S > a2=new A< S >();
		A< T > a3=new A< T >();
		System.out.println("done");
	}
}


/*
X is R or sub class to R
obj is R or sub class to R

X extends R means generic x should be either or otherwise sub class toR.




*/