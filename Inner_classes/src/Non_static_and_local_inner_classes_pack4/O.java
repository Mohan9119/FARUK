package Non_static_and_local_inner_classes_pack4;

public class O {
public static void main(String[] args) {
	int i= 10;
	final int j=10;
	class A
	{
		void test()
		{
			System.out.println(i);
			System.out.println(j);
		}
	}
	//i=20;
	System.out.println("done");
}
}

// inner class will not be effecting while using local inner classs.

//inside class A while using J class A is not effecting 

//class A not depending on J it will not modify further.

// i will be used any were if you are modifying
//i at line number 15 you will get error at line number 11.

//if i is modifying at some where then i is not 
//allowed to use in the local inner class.

// inorder to use i in the local innner classs don't modify.

// if you wnat to use i should act as a final.even though 
//there is a final key word J definately can't modified.

//J is allowed to use in the class A.

//i it is not final so there is chance of modify I in some 
//location if your not modify then I is allowed to use.

// class A can't depend on i and j, i maight be change somewhere
//j shouldn't be changeing it bilnd used in class.