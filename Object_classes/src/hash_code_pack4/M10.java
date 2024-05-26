package hash_code_pack4;

import java.util.HashSet;

class E
{
	int i,j,k;
	E(int i,int j,int k)
	{
		this.i=i;		
		this.j=j;		
		this.k=k;
	}
	@Override
	public String toString() {
		return "("+i+" , "+j+" , "+k+")";
	}
	@Override
	public boolean equals(Object obj) {
		boolean b1=(i==((E)obj).i) && (j==((E)obj).j)&&(k==((E)obj).k);
		System.out.println("equals b/w "+this+" and "+obj+" is "+b1);
		return b1;
	}
	@Override
	public int hashCode() {
		int hash =Integer.toString(i).hashCode();
		hash+=Integer.toString(j).hashCode();
		hash+=Integer.toString(k).hashCode();
		System.out.println("hashcode of "+this+" is "+hash);
		return hash;
	}
}
public class M10 {
	public static void main(String[] args) {
		E e1 =new E(900,100,500);
		E e2 =new E(900,100,500);
		E e3 =new E(100,100,900);
		E e4 =new E(100,100,900);
		E e5 =new E(900,500,100);
		E e6 =new E(900,500,100);
		E e7 =new E(900,700,800);
		E e8 =new E(900,800,700);
		E e9 =new E(700,900,800);
		E e10 =new E(1900,1100,1500);
		HashSet<E>set=new HashSet<E>();
		set.add(e1);
		System.out.println("--------------11----------");
		set.add(e2);
		System.out.println("--------------22----------");
		set.add(e3);
		System.out.println("--------------33----------");
		set.add(e4);
		System.out.println("--------------44----------");
		set.add(e5);
		System.out.println("--------------55----------");
		set.add(e6);
		System.out.println("--------------66----------");
		set.add(e7);
		System.out.println("--------------77----------");
		set.add(e8);
		System.out.println("--------------88----------");
		set.add(e9);
		System.out.println("--------------99----------");
		set.add(e10);
		System.out.println("--------------1010----------");
		System.out.println(set);
	}

}
