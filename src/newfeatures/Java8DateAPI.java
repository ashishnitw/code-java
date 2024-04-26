
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Java8DateAPI {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		d = LocalDate.of(2018, Month.MAY, 20);
		System.out.println(d);
		
		for(String s : ZoneId.getAvailableZoneIds()) {
			//System.out.println(s);
		}
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		t = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
	}
}
