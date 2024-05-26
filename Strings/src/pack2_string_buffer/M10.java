package pack2_string_buffer;

public class M10 
{
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("test");
		System.out.println(sb);
		sb.delete(3,30);
		System.out.println(sb);
	}
}
