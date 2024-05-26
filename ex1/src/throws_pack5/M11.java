package throws_pack5;

import java.sql.DriverManager;
import java.sql.SQLException;

public class M11 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException{
		test1();
	}
	static void test1()throws ClassNotFoundException, SQLException, InterruptedException
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
	static void test2()   throws ClassNotFoundException, SQLException, InterruptedException

		
		{
			 Class.forName("");
			  DriverManager.getConnection("");  
			  Thread.sleep(230);

	}
	}

