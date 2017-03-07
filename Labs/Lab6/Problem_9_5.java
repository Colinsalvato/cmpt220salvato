import java.util.GregorianCalendar;

public class Problem_9_5 {

	public static void main(String[] args) {

		GregorianCalendar date = new GregorianCalendar();

		System.out.println(String.format(
				"Current Date: %s", Problem_9_5.print_date(date)));

		long millis = 5000000L;
		date.setTimeInMillis(millis);
		System.out.println(String.format(
				"Date at %d milli-seconds past Unix Epoch: %s",
				millis,
				Problem_9_5.print_date(date)));
	}
	public static String print_date(GregorianCalendar date) {
		return String.format(
				"%d-%d-%d %d:%d:%d.%d",
				date.get(GregorianCalendar.YEAR),
				date.get(GregorianCalendar.MONTH),
				date.get(GregorianCalendar.DAY_OF_MONTH),
				date.get(GregorianCalendar.HOUR),
				date.get(GregorianCalendar.MINUTE),
				date.get(GregorianCalendar.SECOND),
				date.get(GregorianCalendar.MILLISECOND));
	}
}

