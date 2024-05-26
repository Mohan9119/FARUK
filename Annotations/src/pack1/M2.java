package pack1;

@interface A
{
	int someDesc();
}
@A (someDesc =100)
public class M2 
{
	@A (someDesc =1340)
	public static void main(String[] args) {
		System.out.println("done");
	}
}
