package throw_pack6;

public class A {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException();
		}
		System.out.println(2);
	}

}
// throw keyword is used to raise exception expecilitly.