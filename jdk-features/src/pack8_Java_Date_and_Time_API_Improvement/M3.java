package pack8_Java_Date_and_Time_API_Improvement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class M3 
{
	public static void main(String[] args) {
		//current time
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println("current Date & Time : "+ currentDateTime);
		
		//particular time
		LocalDateTime secondAug2014 = LocalDateTime.of(2014,10,2,12,30);
		System.out.println("second Aug 2014 : "+secondAug2014);

		
		LocalDateTime christmas2014 = LocalDateTime.of(2014,Month.DECEMBER,24,12,0);
		System.out.println("christmas 2014 : "+christmas2014);
		
		
	}
}
