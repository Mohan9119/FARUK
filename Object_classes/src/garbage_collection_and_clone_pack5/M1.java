package garbage_collection_and_clone_pack5;

class A
{
	static A obj;
	@Override
	protected void finalize() throws Throwable {
		obj=this;
		System.out.println("from finalize");
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(1+" : "+a1);
		System.out.println(2+" : "+A.obj);
		Util.sleep(1000);
		a1 =null;
		System.gc();
		Util.sleep(1000);
		System.out.println(3+" : "+a1);
		System.out.println(4+" : "+A.obj);
		A.obj=null;
		Util.sleep(1000);
		System.gc();
		System.out.println(5+" : "+a1);
		System.out.println(6+" : "+A.obj);
		Runtime.getRuntime().gc();
		System.out.println("end");
	}
}

class Util
{
	static void sleep(long millies)
	{
		try
		{
			Thread.sleep(millies);
		}
		catch(InterruptedException Iex)
		{
			Iex.printStackTrace();
		}
	}
}

