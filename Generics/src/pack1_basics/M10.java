package pack1_basics;

class J <x>
{
	x obj;
}
public class M10 
{
	public static void main(String[] args) {
		J<Integer> j1=new J<Integer>();
		J<String> j2=new J<String>();
		J<Double> j3=new J<Double>();
		
		J j4 =new J();
		j1.obj=40;
		j2.obj="abc";
		j3.obj=4.5;
		j4.obj=new Object(); // object type.
		System.out.println("done");
		
	}
}

/*
if your not providing any value 


*/