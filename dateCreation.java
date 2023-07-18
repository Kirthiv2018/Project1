package workoutprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateCreation {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String dateToday = sdf.format(date);
		System.out.println(dateToday);
		
	}

}
