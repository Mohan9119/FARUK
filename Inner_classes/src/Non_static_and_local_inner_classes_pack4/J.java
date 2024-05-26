package Non_static_and_local_inner_classes_pack4;

class I
{
class B
{
	
}
static class C
{
	
}
}
public class J {
	public static void main(String[] args) {
		I.B b1= new I().new B();
		I.C c1=new I.C();
		System.out.println("done");
	}
}
/*
we can use b straight away in main method if main 
method contains inner class.
if not in that class use class referance which contains 
inner class like I.B b1= new I().new B();.

*/