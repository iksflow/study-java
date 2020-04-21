package training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// ����� ���� 
		System.out.println(isInputValid("2018-01-31", "[0-9]{4}(\\-|\\s)(0[1-9]|1[0-2])(\\-|\\s)(0[1-9]|1[0-9]|2[0-9]|3[0-1])"));
		// �޴���ȭ
		System.out.println(isInputValid("010-1234-5678", "^01[0-9]{1}\\-[0-9]{4}-[0-9]{4}$"));
		// ID (���ĺ� ��ҹ���, ����, _�� �����. ���̵�� ���ĺ����� �����ؾ��ϸ� ������ھ�� 1���� ����ϸ� ����� ��ġ�ؾ���. 
		System.out.println(isInputValid("j_a", "^[a-zA-Z]{1}([a-zA-Z0-9])*(_?)([a-zA-Z0-9])*$"));
	}
	
	public static boolean isInputValid(String input, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		return m.find();
	}

}
