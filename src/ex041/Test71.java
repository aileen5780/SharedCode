package ex041;

import java.time.LocalDate;
import java.time.Period;

public class Test71 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015,3, 26);
		Period p = Period.ofDays(1);
		System.out.println(date.plus(p));

	}

}
