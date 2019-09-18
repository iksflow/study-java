package training.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Prac {
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.parse("19901010", DateTimeFormatter.ofPattern("yyyyMMdd"));
		System.out.println(birthDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
	}
}
