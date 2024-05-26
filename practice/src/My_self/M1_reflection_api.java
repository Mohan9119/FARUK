package My_self;

import java.lang.reflect.Field;

class A
{
	int paraml;
	String firstname;
}
public class M1_reflection_api
{
	public static void main(String[] args) {
		Object obj =new A();
		
		test(obj);
		System.out.println("................");
		test("hello");
		System.out.println("--  --  --  --  --  --  --  --  --  --  ");
		test(30000);
	}
	static void test(Object obj)
	{
		Class c1=obj.getClass();
		System.out.println(c1.getName());
		
		Field[] fields=c1.getDeclaredFields();
		for (Field field: fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getType());
			System.out.println("============================================");
			
		}
	}
}
