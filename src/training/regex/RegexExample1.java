package training.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		// 사람이름 (박씨 성으로 시작하고 이름이 1자이상인사람)
		System.out.println(isInputValid("박사람", "^박[가-힣]{1,}$"));
		// 특정사람이름 제외하기(특정 문자열 제외하기)
		System.out.println(isInputValid("박사람", "^박(?!사람)([가-힣]{1,})$"));
		// 특정문자 여러개 제외하기 (박사람, 박천재)
		System.out.println(isInputValid("박사람", "^박([?!사람|천재]{2})([가-힣]{1,})$"));
		System.out.println(Arrays.asList("".split("\\|")).isEmpty());
		int[] a = {};
		List<String> list = new ArrayList<>();
//		List<String> list2 = new ArrayList<>(Arrays.asList(a).isEmpty());
		System.out.println(Arrays.asList(a).getClass());
		System.out.println(list.getClass());
//		System.out.println(list.isEmpty());
		
	}
	
	public static boolean isInputValid(String input, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		return m.find();
	}

}
