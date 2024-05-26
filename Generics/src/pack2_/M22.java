package pack2_;

class G < X >
{
	X obj;
}
public class M22 
{
	public static void main(String[] args) {
		G < ? > g1 = null;
		g1 =new G < Integer >();
		g1 =new G < Object >();
		g1 =new G < P >();
		g1 =new G < String >();
		g1 =new G < Thread >();
		System.out.println("done");
	}
}

//3 types of references like this
//1)	wild card question mark with no boundry

// g1 is a g data type 
// ? is a wild card characher in the 
// then g1  can point to G refer can any data type of x
