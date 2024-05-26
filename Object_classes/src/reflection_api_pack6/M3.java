package reflection_api_pack6;

class C
{
	static
	{
		System.out.println("SIB");
	}
}
public class M3 {
	public static void main(String[] args) throws ClassNotFoundException 
	{
		C c1=new C();
		Class obj1 = c1.getClass();
		Class obj2=Class.forName("reflection_api_pack6.C");
		System.out.println(obj1 == obj2);
		System.out.println("done");
	}
}
