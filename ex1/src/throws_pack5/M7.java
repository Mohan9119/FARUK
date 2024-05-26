package throws_pack5;

import java.sql.DriverManager;

public class M7 {

	public static void main(String[] args)  throws Exception{
		test1();

	}
  static void test1() throws Exception
{
	  test2();
}
  static void test2() throws Exception
  {
	  Class.forName("");
	  DriverManager.getConnection("");   //instated of this three we can go for throws Exception
	  Thread.sleep(234);
  }
};