package pack2_string_buffer;

public class M2 
{
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		sb1.append("hello");
		
		StringBuffer sb2=new StringBuffer();
		sb1.append("hello");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
	}
}
