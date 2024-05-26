package pack1;
@interface A7
{
	int version() default 1;
	String author() default "fun";
	String platform() default "windows"; 
}
@A7 (author="fdds")
public class M7 
{
	@A7(author="abc")
	public static void main(String[] args) {
		System.out.println("main");
	}
}