package Anonymous_inner_class_pack5;

public class M2 
{
	public static void main(String[] args) {
		A a1=new A()
				{
					void test1()
					{
						System.out.println("AIC.test1()");
					}
				};
		a1.test1();
		a1.test2();
	}
}
/*
#line 6 A() onwards line 12 is one supper class.

#for this super class is A. its constructor is no args constructor.

#sub class doesn't have any name. because of no name it 
is called as anonymous inner class.

# we are not creating object to A
we are creating object to sub class, that sub class has 
no name i.e, why it is called as anonymous inner class.

# anonymous inner class {--} this anonymous inner class 
doesn't have any name for that anonymous inner class specify
only what is supper class and its constructor.

# from A 2 methods are in-herited to anonymous inner class 
b/t 2 one got overrided other is not overrided.

#a1 pointing to an object of subclass to A in that sub class test1 
method is overrided and test2 is not overrided.

# 
*/