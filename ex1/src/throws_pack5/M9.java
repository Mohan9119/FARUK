package throws_pack5;

import java.sql.DriverManager;

public class M9 {
public static void main(String[] args) {
	test1();
}
static void test1()
{
	//test2();
	try
	{
		test2();
	}
	catch(ClassNotFoundException ex)
	{
		
	}
	catch(InterruptedException ex)
	{
		
	}
}
static void test2()   throws ClassNotFoundException,

	
	{
		 Class.forName("");
		  DriverManager.getConnection("");  
		  Thread.sleep(230);

}
}
