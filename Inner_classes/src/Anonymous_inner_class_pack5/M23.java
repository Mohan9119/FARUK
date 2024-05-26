package Anonymous_inner_class_pack5;

public class M23 {
static D method1()
{
	return newD()
			{
				public void test1()
				{
					System.out.println("from test1");

				}
			};
}
public static void main(String[] args) {
	D obj =method1();
	obj.test1();
	
}
}


//if anonymous inner class contain any abstract method 
//.then we will get error.

//if more than one method in the interface anonymous 
//inner class only using 

//