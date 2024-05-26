package pack1;
@interface A6
{
	int version() default 1;
	String author() default "fun";
}
@A6 (author="fdds")
public class M6 
{
	@A6
	public static void main(String[] args) {
		System.out.println("main");
	}
}

// while using annotation o nly default method can skipped.


