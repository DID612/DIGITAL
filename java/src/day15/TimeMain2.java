package day15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeMain2 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E요일");
		String dateString = simpleFormat.format(date);
		System.out.println(dateString);
		
		String dateString2 = "2020-01-01 14:30:00";
		SimpleDateFormat simpleFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2 = simpleFormat2.parse(dateString2);
		System.out.println(date2);
	}

}
