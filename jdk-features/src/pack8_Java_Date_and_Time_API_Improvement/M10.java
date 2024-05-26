package pack8_Java_Date_and_Time_API_Improvement;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters.*;

public class M10 
{
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, Month.FEBRUARY, 25);
		
		//last day of  2014(2014-02-28)
		LocalDate lastDayOfYear = date.with(lastDayOfYear());
		
		
		//first day of next month(2014-03-01)
		LocalDate firstDayOfNextMonth = date.with(firstDayOfNextMonth());
		
		//next sunday(2014-03-02)
		LocalDate nextSunday =date.with(next(DayOfWeek.SUNDAY));
		
	}
}
