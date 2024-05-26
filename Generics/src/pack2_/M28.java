package pack2_;

class M < X >
{
	X obj;
}
public class M28 
{
	public static void main(String[] args) {
		M < ? super Q>m1=null;
		m1=new M <Q>();
		m1=new M <P>();
		m1=new M <Object>();
		System.out.println("done");
	}
}

// 3 way of usage of wild card characters

//wild card super with one class name.