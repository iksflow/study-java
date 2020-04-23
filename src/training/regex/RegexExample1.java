package training.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		// »ı³â¿ù Æ÷¸Ë 
		System.out.println(isInputValid("2018-01-31", "[0-9]{4}(\\-|\\s)(0[1-9]|1[0-2])(\\-|\\s)(0[1-9]|1[0-9]|2[0-9]|3[0-1])"));
		// ÈŞ´ëÀüÈ­
		System.out.println(isInputValid("010-1234-5678", "^01[0-9]{1}\\-[0-9]{4}-[0-9]{4}$"));
		// ID (¾ËÆÄºª ´ë¼Ò¹®ÀÚ, ¼ıÀÚ, _¸¦ Çã¿ëÇÔ. ¾ÆÀÌµğ´Â ¾ËÆÄºªÀ¸·Î ½ÃÀÛÇØ¾ßÇÏ¸ç ¾ğ´õ½ºÄÚ¾î´Â 1°³¸¸ Çã¿ëÇÏ¸ç °¡¿îµ¥¿¡ À§Ä¡ÇØ¾ßÇÔ. 
		System.out.println(isInputValid("j_a", "^[a-zA-Z]{1}([a-zA-Z0-9])*(_?)([a-zA-Z0-9])*$"));
		// »ç¶÷ÀÌ¸§ (¹Ú¾¾ ¼ºÀ¸·Î ½ÃÀÛÇÏ°í ÀÌ¸§ÀÌ 1ÀÚÀÌ»óÀÎ»ç¶÷)
		System.out.println(isInputValid("¹Ú»ç¶÷", "^¹Ú[°¡-ÆR]{1,}$"));
		// Æ¯Á¤»ç¶÷ÀÌ¸§ Á¦¿ÜÇÏ±â(Æ¯Á¤ ¹®ÀÚ¿­ Á¦¿ÜÇÏ±â)
		System.out.println(isInputValid("¹Ú»ç¶÷", "^¹Ú(?!»ç¶÷)([°¡-ÆR]{1,})$"));
		// Æ¯Á¤¹®ÀÚ ¿©·¯°³ Á¦¿ÜÇÏ±â (¹Ú»ç¶÷, ¹ÚÃµÀç)
		System.out.println(isInputValid("¹Ú»ç¶÷", "^¹Ú([?!»ç¶÷|ÃµÀç]{2})([°¡-ÆR]{1,})$"));
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
