package arrays;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		System.out.println(today);
		Date startDate = getMonday(today);
		
		
		
//		        IntStream stream = IntStream.range(1, 5);
//		        stream = stream.peek(i -> log("starting", i))
//		                       .filter(i -> {
//		                           log("filtering", i);
//		                           return i % 2 == 0;
//		                       })
//		                       .peek(i -> log("post filtering", i));
//		        log("Invoking terminal method count.");
//		        log("The count is", stream.count());
		        
		        List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
				List<Integer> result = new ArrayList<Integer>();
				 
				Stream<Integer> stream = ss.stream();
				 
				stream.map(s -> {
				        synchronized (result) {
				          if (result.size() < 10) {
				            result.add(s);
				          }
				        }
						return s;
				    }).forEach( e -> {});
				 System.out.println(result);
		  
		
}
	
	
	public static Date getMonday(Date today) {
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(today);
		
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		
		while (dow != Calendar.MONDAY) {
		    int date = cal.get(Calendar.DATE);
		    
		    if (date == 1) {
		        int month = cal.get(Calendar.MONTH);
		        
		        if (month == Calendar.JANUARY) {
		            month = Calendar.DECEMBER;
		            
		            cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) - 1);
		        } else {
		            month--;
		        }
		        
		        cal.set(Calendar.MONTH, month);
		        
		        date = getMonthLastDate(month, cal.get(Calendar.YEAR));
		    } else {
		        date--;
		    }
		    
		    cal.set(Calendar.DATE, date);
		    
		    dow = cal.get(Calendar.DAY_OF_WEEK);
		}
		
		return cal.getTime();
	}
	
	private static int getMonthLastDate(int month, int year) {
		switch (month) {
		    case Calendar.JANUARY:  
		    case Calendar.MARCH:
		    case Calendar.MAY:
		    case Calendar.JULY:
		    case Calendar.AUGUST:
		    case Calendar.OCTOBER:
		    case Calendar.DECEMBER:
		        return 31;
		
		    case Calendar.APRIL:
		    case Calendar.JUNE:
		    case Calendar.SEPTEMBER:
		    case Calendar.NOVEMBER:
		        return 30;
		        
		    default:    //  Calendar.FEBRUARY
		        return year % 4 == 0 ? 29 : 28;
		}
		}
	
	public static void log (Object... objects) {
        String s = LocalTime.now().toString();
        for (Object object : objects) {
            s += " - " + object.toString();
        }
        System.out.println(s);
        // putting a little delay so that we can see a clear difference
        // with parallel stream.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
