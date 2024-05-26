package pack2_string_buffer;

public class M9 
{
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("test");
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
	}
}
