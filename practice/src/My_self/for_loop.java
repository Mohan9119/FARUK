package My_self;


public class for_loop {
	public static void main(String[] args) {
		int i,j,k;
		int n=5;
		for(i=0; i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for (k=0;k<=i;k++) 
			{
			System.out.print(" *");
			}
			System.out.println();
		}
		for(i=n-1;i>=0;i--)
		{
			for (j=1;j<=n;j++) {
				System.out.print(" ");
			}
			for(k=0;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
