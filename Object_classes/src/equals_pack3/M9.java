package equals_pack3;

public class M9 {
	public static void main(String[] args) {
		Integer obj1=new Integer(90);
		Integer obj2=new Integer(90);
		Integer obj3=90;
		
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj3));
	}
}

/*
in all the vapour class object class equal method is 
overridded.And at obj3 is automatically boxing. 

*/