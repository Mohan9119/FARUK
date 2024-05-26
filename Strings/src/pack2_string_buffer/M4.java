package pack2_string_buffer;

public class M4 
{
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("---------------------------");
		sb1.append("123456789876543234567876543234567876543");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
	}
}
