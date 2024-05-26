package pack1_Basics_and_important_methods;

public class M63 
{
	public static void main(String[] args) {
		String s1="abc xyz   hello.java  123,test";
		String[] splits =s1.split("\\s,.]+");
		for (String split: splits)
		{
			System.out.println(split);
		}
	}
}


// in this "abc xyz hello 123" ' ' it is used as a separator