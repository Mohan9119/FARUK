package pack8_Java_Date_and_Time_API_Improvement;

import java.time.LocalDate;
import java.time.Year;

public class M7 
{
	public static void main(String[] args) {
		Year currentYear =Year.now();
		Year twoThousand =Year.of(2000);
		boolean isleap = currentYear.isLeap();
		int length = currentYear.length();
		
		//sixtyFourth day of 2014(2014-03-05)
		LocalDate date = Year.of(2014).atDay(64);
		
	}
}
