package pack8_Java_Date_and_Time_API_Improvement;

import java.time.LocalTime;

public class M4 
{
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(15, 30);
		int hour =time.getHour();
		int minutes =time.getMinute();
		int seconds =time.getSecond();
		int secodOfDay= time.toSecondOfDay();
		
	}
}
