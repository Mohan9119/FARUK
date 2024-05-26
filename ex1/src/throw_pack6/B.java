package throw_pack6;

public class B {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException("some message");
		}
		System.out.println(2);
	}

}