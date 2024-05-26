package pack8_Java_Date_and_Time_API_Improvement;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class M6 
{
	public static void main(String[] args) 
	{
		LocalDate date =LocalDate.of(2014, 2, 15);
		boolean isBefore =LocalDate.now().isBefore(date);
		
		//information about the month
		Month february = date.getMonth();
		int februaryIntValues=february.getValue();
		int minLength = february.minLength();
		int maxLength = february.maxLength();
		Month firstMonthofQuarter =  february.firstMonthOfQuarter();
		
		//information about the year
		int year=date.getYear();
		int dayOfYear = date.getDayOfYear();
		int lengthOfYear = date.lengthOfYear();
		boolean isLeapYear =date.isLeapYear();
		DayOfWeek dayOfWeek =date.getDayOfWeek();
		int dayOfWeekIntValue = dayOfWeek.getValue();
		String dayOfWeekName = dayOfWeek.name();
		int dayOfMonth = date.getDayOfMonth();
		LocalDateTime startOfDay = date.atStartOfDay();
	}
}
