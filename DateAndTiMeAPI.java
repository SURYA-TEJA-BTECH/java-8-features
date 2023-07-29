package in.surya;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTiMeAPI {
	
	
	
	
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		//convert  date to String
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");
		String format = sdf.format(date);
		System.out.println(format);
		
		
		String format2 = new SimpleDateFormat("dd/MMM/yyyy").format(date);
		System.out.println(format2);
		String format3 = new SimpleDateFormat("MM/dd/yyyy").format(date);
		System.out.println(format3);
	
		Date format4 = new SimpleDateFormat("MM/dd/yyyy").parse("07/26/2023");
		System.out.println(format4);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
