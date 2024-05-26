package equals_pack3;

class G
{
	int i;
	G(int i)
	{
		this.i=i;
	}
	@Override
	public boolean equals(Object obj) 
	{
		return (obj instanceof G)&&(i==((G)obj).i);
	}
}
public class M6 {
	public static void main(String[] args) {
		G g1=new G(90);	//g object i value 90
		F f1=new F(90);	//f object i value 90
		A a1=new A();	//a object i value 90
		a1.i=90;
		
		System.out.println(g1.equals(f1));
		System.out.println(g1.equals(a1));
		System.out.println(g1.equals(90));  	//g1.i is a 90 equals arg is 90 so that 90 boxing into integer object 
		System.out.println(g1.equals(90.0)); 	//g1.i is a 90 equals arg is 90 so that 90 boxing into double object 
	}
}
