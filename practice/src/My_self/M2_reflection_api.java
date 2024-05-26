package My_self;

import java.lang.reflect.Method;

class B
{
	void test1()
	{
		
	}
	int test2()
	{
		return 200;
	}
	String test3()
	{
		return "hello";
	}
}
public class M2_reflection_api {
	public static void main(String[] args) {
		B b1 = new B();
		String s1="hello";
		Integer obj=200;
		Info(b1);
		System.out.println(".....................");
		Info(s1);
		System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
		Info(obj);
	}
	static void Info(Object obj)
	{
		Class c1 =obj.getClass();
		Method[] methods =c1.getMethods();
		for (Method method: methods)
		{
			System.out.println(method.getName()+" : "+method.getReturnType());
		}
	}
}
