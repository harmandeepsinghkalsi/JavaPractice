package dynamicProgramming;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import org.apache.poi.util.SystemOutLogger;

 public class UglyNumbers {

	 public static void main(String args[]) throws Exception{
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

		 String date = sdf.format(new Date());
		 
		 System.out.println(date);
		 Date today = sdf.parse(date);
		
		 System.out.println(today);
		 Calendar currentDateBefore6Months = Calendar.getInstance();
		 currentDateBefore6Months.add(Calendar.MONTH, -6);
			
			System.out.println(currentDateBefore6Months.getTime());
			
			String sixMonthsBefore= sdf.format(currentDateBefore6Months.getTime());
			
			System.out.println(sixMonthsBefore);
			
			Date sixMonthBef = sdf.parse(sixMonthsBefore);
			System.out.println(sixMonthBef);
			
			
			
			}
	 
 }


