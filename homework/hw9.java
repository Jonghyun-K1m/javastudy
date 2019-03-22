package hwhome;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hw9 {
	public static void main(String args[]) {
		Calendar cnow=Calendar.getInstance();
		int hour=cnow.get(Calendar.HOUR_OF_DAY);
		
		if(hour>=4 && hour<=12)System.out.println("good Morning");
		else if(hour>12 && hour<=18)System.out.println("good Afternoon");
		else if(hour>18 && hour<=22)System.out.println("good Eve");
		else System.out.println("good Night");
		
		Date now= new Date();
		String strnow=now.toString();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd/ hh:mm");
		String strnow2=sdf.format(now);
	
		System.out.println(strnow2);
		
	}
}
