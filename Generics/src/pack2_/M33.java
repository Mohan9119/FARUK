package pack2_;
class Ra < X >
{
	X obj;
}
public class M33 
{
	public static void main(String[] args) {
		Ra < ? >r1=null;
		r1 = new Ra < Integer >();
		
		r1.obj=20;
		System.out.println("done");
	}
}
