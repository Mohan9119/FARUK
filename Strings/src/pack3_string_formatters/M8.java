package pack3_string_formatters;

public class M8 
{
	public static void main(String[] args) {
		int i=10;
		double j=1.5;
		System.out.printf("i value if %d and j value if %f",i,j);
		System.out.println();
		System.out.printf("j value is %2$f and i value is %1$d",i,j);

	}
}
