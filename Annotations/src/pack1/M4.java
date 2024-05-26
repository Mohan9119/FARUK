package pack1;

@interface A4
{
	int version();
	String author();
}
//  @A4 (author="fdds")
public class M4 {
	@A4 (author="hjg",version=3)
	public static void main(String[] args) {
		System.out.println("main");
	}

}
