package training.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		// ����̸� (�ھ� ������ �����ϰ� �̸��� 1���̻��λ��)
		System.out.println(isInputValid("�ڻ��", "^��[��-�R]{1,}$"));
		// Ư������̸� �����ϱ�(Ư�� ���ڿ� �����ϱ�)
		System.out.println(isInputValid("�ڻ��", "^��(?!���)([��-�R]{1,})$"));
		// Ư������ ������ �����ϱ� (�ڻ��, ��õ��)
		System.out.println(isInputValid("�ڻ��", "^��([?!���|õ��]{2})([��-�R]{1,})$"));
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
