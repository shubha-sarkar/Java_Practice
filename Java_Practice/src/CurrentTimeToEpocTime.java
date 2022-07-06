import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CurrentTimeToEpocTime {

	public static void main(String[] args) {
		
		System.out.println(currentToEpocTime());
		System.out.println(currentToEpocTime());
	}
	
	public static long currentToEpocTime() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
		String curTime = dateFormat.format(Calendar.getInstance().getTime());
		System.out.println(curTime);
		long epocTime = ZonedDateTime.parse(curTime, DateTimeFormatter.ofPattern("MMM dd yyyy HH:mm:ss.SSS zzz")).toInstant().toEpochMilli();
		
		return epocTime;
	}

}
