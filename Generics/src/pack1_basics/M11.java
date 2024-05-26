package pack1_basics;

class K <x>
{
	void test(x obj)
	{
		
	}
}
public class M11 
{
	public static void main(String[] args) {
		K<Integer> k1=new K<Integer>();
		K<String> k2=new K<String>();
		K<Double> k3=new K<Double>();
		
		k1.test(40);
		k2.test("abc");
		k3.test(3.5);
		System.out.println("done");
		
	}
}

/*
if your not providing any value 


*/