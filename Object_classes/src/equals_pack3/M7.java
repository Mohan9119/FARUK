package equals_pack3;

class H
{
	int i,j,k;
	H(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof H)&&i==((H)obj).j && k==((H)obj).k;
	}
}
public class M7 {
	public static void main(String[] args) {
		H h1=new H(10,20,30);
		H h2=new H(10,20,30);
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(10));
		System.out.println(h1.equals(new H(10,20,30)));
		System.out.println(h1.equals(new H(10,20,31)));
		System.out.println(h1.equals("hello"));
	}
}
