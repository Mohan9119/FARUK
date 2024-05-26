package reflection_api_pack6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class D
{
	int i;
	void test1()
	{
		System.out.println("from test/..........................");
	}
}
public class M4 
{
	public static void main(String[] args) throws Exception {
		Class  c1 =Class.forName("reflection_api_pack6.D");
		Object obj = c1.newInstance();
		Field f1 =c1.getDeclaredField("i");
		f1.setInt(obj, 20);
		Method m1 = c1.getDeclaredMethod("test1");
		m1.invoke(obj);
		System.out.println(f1.getInt(obj));
	}
}
