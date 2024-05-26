package pack3_set;

import java.util.HashSet;

class C
{
	int i,j,k;
	C( int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i+ " , "+j+" , "+k+")";
	}
	@Override
	public int hashCode() {
		String s1 =Integer.toString(i);
		String s2 =Integer.toString(j);
		String s3 =Integer.toString(k);
		int hash =s1.hashCode();
		hash+= s2.hashCode();
		hash+= s3.hashCode();
		System.out.println("hashcode for: "+this +" is "+hash);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
	//	return ( i==((C)obj).i) &&( j== ((C)obj).j) &&( k== ((C)obj).k);
		boolean b1= ( i==((C)obj).i) &&( j== ((C)obj).j) &&( k== ((C)obj).k);
		System.out.println("equals b/w "+this +" and "+obj+" is "+b1);
		return b1;
	}
}
public class M7 
{
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(new C(10,20,30)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(10,20,30)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(10,20,30)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(20,10,30)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(20,10,30)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(100,20,30)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(20,100,30)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(100,20,300)));
		System.out.println("---------------------------");
		System.out.println(set.add(new C(300,100,20)));
		System.out.println("---------------------------");
		System.out.println(set);
	}
}
/*
hash code expression is very fast and very effective just because there 
is no boolean expression.
if hash number is different  no need call equals method
if hash number is same then only need call equals method

equals method have boolean expression so its time taken but more
accurate.
It comparing attribute to attribute.
equals method not calling 1st self because of taking more time.
if hashcode method is enable to identify the duplication then 
only equals method used.

inside a hash set elements are stored in buckets those are called as hashbucket.
hashcode identify inequality.
it can't identify equality,for that equals method used




*/