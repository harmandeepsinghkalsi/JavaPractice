import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOfWeek {
	
	public static void main(String []args) throws ParseException
	{
		Calendar c = Calendar.getInstance();
        c.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("05-08-2015"));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek); // 1 being SUnday
	}
}	
