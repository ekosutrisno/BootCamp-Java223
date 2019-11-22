package Pertemuan2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static void main(String[] args) {
		System.out.println(validate("ekosutrisno801@gmail.com"));
		System.out.println(validate("ekosutrisno801@outlook.co.id"));
		System.out.println(validate("ekosutrisno801.gmail.com"));

	}
	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
}
