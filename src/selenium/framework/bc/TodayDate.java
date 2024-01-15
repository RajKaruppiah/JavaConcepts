package selenium.framework.bc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDate {
	
	public String todayDate() {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		return dateFormat.format(date).toString();
				
		
	}

	public static void main(String[] args) {

		TodayDate d = new TodayDate();
		System.out.println(d.todayDate());
	}

}
