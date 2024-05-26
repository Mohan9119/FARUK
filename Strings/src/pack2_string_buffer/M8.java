package pack2_string_buffer;

public class M8 
{
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("hellotoall");
		System.out.println(sb);
		sb.delete(3,7);
		System.out.println(sb);
	}
}
