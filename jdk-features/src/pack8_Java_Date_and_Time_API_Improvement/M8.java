package pack8_Java_Date_and_Time_API_Improvement;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class M8 
{
	public static void main(String[] args) {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("tomorrow : "+ tomorrow);
		
		//before 5 hours and 30mins
		LocalDateTime dateTime= LocalDateTime.now().minusHours(5).minusMinutes(30);
		System.out.println("dateTime: "+dateTime);
	}
}
