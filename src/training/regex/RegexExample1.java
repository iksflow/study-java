package training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// 생년월 포맷 
		System.out.println(isInputValid("2018-01-31", "[0-9]{4}(\\-|\\s)(0[1-9]|1[0-2])(\\-|\\s)(0[1-9]|1[0-9]|2[0-9]|3[0-1])"));
		// 휴대전화
		System.out.println(isInputValid("010-1234-5678", "^01[0-9]{1}\\-[0-9]{4}-[0-9]{4}$"));
		// ID (알파벳 대소문자, 숫자, _를 허용함. 아이디는 알파벳으로 시작해야하며 언더스코어는 1개만 허용하며 가운데에 위치해야함. 
		System.out.println(isInputValid("j_a", "^[a-zA-Z]{1}([a-zA-Z0-9])*(_?)([a-zA-Z0-9])*$"));
	}
	
	public static boolean isInputValid(String input, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		return m.find();
	}

}
