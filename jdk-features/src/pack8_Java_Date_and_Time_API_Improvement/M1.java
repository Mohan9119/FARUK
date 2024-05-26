package pack8_Java_Date_and_Time_API_Improvement;

import java.time.LocalDate;
import java.time.Month;

public class M1 
{
	public static void main(String[] args) {
		//current date
		LocalDate currentDate =LocalDate.now();
		System.out.println("current date : "+ currentDate);
		
		//2014-02-10
		LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
		System.out.println("tenthFeb2014 : "+tenthFeb2014);

		//month values start at 1(2014-08-01)
		LocalDate firstaug2014 = LocalDate.of(2014, 8, 1);
		System.out.println("firstaug2014 : "+firstaug2014);
		
		//the 65th days of 2010(2010-03-06)
		LocalDate sixtyfifthDayof2010 =LocalDate.ofYearDay(2010, 65);
		System.out.println("sixtyfifthDayof2010 : "+sixtyfifthDayof2010);
	}
}
