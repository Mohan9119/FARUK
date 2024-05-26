package pack2_;
class Qa < X >
{
	X obj;
}
public class M32 
{
	public static void main(String[] args) {
		Qa <Integer >q1=null;
		q1 = new Qa < Integer >();
		q1 = new Qa< String >();
		q1.obj=20;
		System.out.println("done");
	}
}
