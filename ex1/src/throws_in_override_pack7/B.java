package throws_in_override_pack7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

class A
{
	void test1() throws NullPointerException
	{
	}
	void test2() throws ClassNotFoundException
	{
	}
	void test3() throws FileNotFoundException
	{
	}
	void test4() throws IOException
	{
	}
	void test5() throws Exception
	{
	}
	void test6() throws Throwable
	{
	}
}
public class B {
	/*
	  void test1()
	{
	}
	void test2()
	{
	}
	void test3()
	{
	}
	void test4()
	{
	}
	void test5()
	{
	}
	void test6()
	{
	}
	*/
	/*
	 void test1() throws ArithmeticException
	{		
	}
	void test2() throws ArithmeticException
	{
	}
	void test3() throws ArithmeticException
	{
	}
	void test4() throws ArithmeticException
	{
	}
	void test5() throws ArithmeticException
	{
	}
	void test6() throws ArithmeticException
	{
	}
	*/
	/*
	void test1() throws ParseException
	{		
	}
	void test1() throws ClassNotFoundException
	{
	}
	*/
	
	void test2() throws ClassNotFoundException
	{
	}
	/*
	void test2() throws ParseException
	{
	}
	void test2() throws InterruptedException
	{
	}
	*/
	/*
	void test3() throws ParseException
	{
	}
	void test3() throws InterruptedException
	{
	}
	*/
	void test3() throws FileNotFoundException
	{
	}
	
}
