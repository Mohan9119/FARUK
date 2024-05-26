package equals_pack3;

class B
{
	int i;
	double j;
	B(int i , double j)
	{
		this.i=i;
		this.j=j;
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1= new B(10, 2.5);
		B b2= new B(10, 2.5);
		B b3=b2;
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.i == b2.i && b2.j ==b1.j);
		
		System.out.println(b2 == b3);
		System.out.println(b2.equals(b3));
		System.out.println(b2.i == b3.i && b2.j ==b3.j);
	}
}
