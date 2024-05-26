package pack8_Java_Date_and_Time_API_Improvement;

import java.time.LocalTime;
import java.time.ZoneId;

public class M5 
{
	public static void main(String[] args) {
		LocalTime currentTimeInLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("currentTimeInLosAngeles : "+ currentTimeInLosAngeles);
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
		LocalTime currentTimeInKOlkata=LocalTime.now(zoneid1);
		System.out.println("currentTimeInKOlkata : "+currentTimeInKOlkata);
		ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");
		LocalTime currentTimeInTokyo=LocalTime.now(zoneid2);
		System.out.println("currentTimeInTokyo : "+currentTimeInTokyo);
		
	}
}
