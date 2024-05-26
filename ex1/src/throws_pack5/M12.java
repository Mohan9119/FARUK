package throws_pack5;

import java.sql.DriverManager;
import java .sql.SQLException;

public class M12 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		test1();
	}
	static void test1() throws ClassNotFoundException, SQLException, InterruptedException
	{
			test2();
	}
 	static void test2()   throws ClassNotFoundException, SQLException, InterruptedException

		
		{
			 Class.forName("");
			  DriverManager.getConnection("");  
			  Thread.sleep(230);

	     }
	}


