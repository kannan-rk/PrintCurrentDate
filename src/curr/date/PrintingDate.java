package curr.date;

import java.time.LocalDate;

// To display the current date, import the java.time.LocalDate class, and use its now() method:
public class PrintingDate {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println("Today's date :" + ld);
	}
}
