package pack8_Java_Date_and_Time_API_Improvement;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class M2 
{
	public static void main(String[] args) {
		//current time
		LocalTime currentTime=LocalTime.now();
		System.out.println("current Time : "+ currentTime);
		
		//particular time
		LocalTime midday = LocalTime.of(12,0);
		System.out.println("midday : "+midday);

		
		LocalTime aftermidday = LocalTime.of(13, 30, 15);
		System.out.println("after midday : "+aftermidday);
		
		
		LocalTime fromsecondsofday =LocalTime.ofSecondOfDay(12345);
		System.out.println("from seconds of day : "+fromsecondsofday);
	}
}
