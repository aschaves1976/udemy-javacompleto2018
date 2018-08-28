package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program10Calendar {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date sd = new Date();

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);

		Calendar cal2 = Calendar.getInstance();
		cal.setTime(sd);

		int dias = cal2.get(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR);

		// Not working well
		System.out.println(
				"Quantidade de dias entre " + sdf.format(d) + " e " + sdf.format(sd) + " é: " + dias + " dias.");

		d = cal.getTime();
		System.out.println(sdf.format(d));

		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);

		int seconds = cal.get(Calendar.SECOND);
		System.out.println("Seconds: " + seconds);

		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month: " + month);

		Period period = new Period();

	}

}
