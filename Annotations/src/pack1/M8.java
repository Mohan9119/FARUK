package pack1;
@interface A8
{
	int[] version();

}
@A8 (version= {1,2,3})
public class M8 
{
	@A8(version= {1,2,3})
	public static void main(String[] args) {
		System.out.println("main");
	}
}