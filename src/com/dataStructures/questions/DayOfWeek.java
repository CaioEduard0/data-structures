package com.dataStructures.questions;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

//    public static String findDay(int month, int day, int year) {
////        LocalDate lc = null;
////        lc.of(year, month, day);
////        return lc.getDayOfWeek().toString();
//    	Calendar calendar = new GregorianCalendar(year, month, day);
//    	String s = ""+calendar.getFirstDayOfWeek();
//    	return s;
//    }

}

public class DayOfWeek {
	
	public static void main(String[] args) throws IOException {
		
	   // public static String findDay(int month, int day, int year) {
//	        LocalDate lc = null;
//	        //lc.of(year, month, day);
	        //return lc.getDayOfWeek().toString();
	    	Calendar calendar = new GregorianCalendar(7, 5, 2999);
	    	//calendar.setFirstDayOfWeek(5);
	    	System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	    	int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	    	
	    	
	    	LocalDate lc = LocalDate.of(2999, 8, 5);
	    	System.out.println(lc.getDayOfWeek().toString());
	        if ( dayOfWeek == 0) {
	        	System.out.println("MONDAY");
	    
	        } else if ( dayOfWeek == 1) {
	        	System.out.println("TUESDAY");
	        
	        } else if ( dayOfWeek == 2) {
	        	System.out.println("WEDNESDAY");
	      
	        } else if ( dayOfWeek == 3) {
	        	System.out.println("THURSDAY");

	        } else if ( dayOfWeek == 4) {
	        	System.out.println("FRIDAY");
	        
	        } else if ( dayOfWeek == 5) {
	        	System.out.println("SATURDAY");
	        
	        } else {
	        	System.out.println("SUNDAY");

	        }
	    	//return s;
	    }
		
		
		
}
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter());
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
	
//}
