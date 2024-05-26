package Lambda_pack6;

interface A10
{
	void test(int i);
}
public class M8
{
	public static void main(String[] args) {
		A10 a1=(X)->System.out.println("from test:"+X);
		a1.test(10);
		System.out.println("done");
	}
}
