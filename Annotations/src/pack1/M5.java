package pack1;
@interface A5
{
	int version() default 1;
	String author();
}
@A5 (author="fdds")
public class M5 
{
	@A5(author="abc", version=3)
	public static void main(String[] args) {
		System.out.println("main");
	}
}
