package Lambda_pack6;

@FunctionalInterface
interface A15
{
	int sum(int i,int j);
}
public class M13 {
	public static void main(String[] args) {
		A15 a1 =(i,j)->i+j;
		int i=a1.sum(10, 20);
		System.out.println("done with : "+i);
	}

}

/*
we can expcitily mark single interface as a @FunctionalInterface

it is allowed only for single method interfaces




*/