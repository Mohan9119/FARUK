package Enum1_pack;

public class A 
{
	enum Month
	{
		JAN(31),FEB(28), MAR(31), APR(30), MAY(31), JUN(31),
		JUL(30), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
		int days;
		Month(int days)
		{
			this.days=days;
		}
		public int getDays()
		{
			return days;
		}
		public String getMonthName() {
			return name();
			
		}
	}
	public static void main(String[] args) {
		Month m1=Month.FEB;
		System.out.println(m1.getMonthName()+":"+m1.getDays());
		m1=Month.APR;
		System.out.println(m1.getMonthName()+":"+m1.getDays());
		m1=Month.JAN;
		System.out.println(m1.getMonthName()+":"+m1.getDays());
	}
}

/*
througth argument we can specify common property 

every month having daya but no of days varying jan-feb-mar.

*/