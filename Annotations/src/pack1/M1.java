package pack1;

@interface A1
{
	String someDesc();
}
@A1 (someDesc="some desc about A1")
public class M1 
{
	@A1 (someDesc="some desc about main ")
	public static void main(String[] args) {
	System.out.println("done");
}
}
