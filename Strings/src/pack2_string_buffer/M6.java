package pack2_string_buffer;

public class M6 
{
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("test");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("---------------------------");
		sb1.append("1234567898765432347655676543");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("---------------------------");
		sb1.trimToSize();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}
}
