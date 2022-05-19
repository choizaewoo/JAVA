package JAVA_20220329;

import java.util.Scanner;



public class P3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] choSung = { "ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ",
		"ㅎ" };
		String[] jungSung = { "ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ",
		"ㅡ", "ㅢ", "ㅣ" };
		String[] jongSung = { "", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ",
		"ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };

	
		String Hanguel = "스타벅스아이스아메리카노";

		for (int i = 0; i < Hanguel.length(); i++) {
			char uniVal = Hanguel.charAt(i);
			//초성순서 = 한글문자코드 - 0xAC00(한글시작점) /21(중성개수) / 28(종성개수) 
			char cho = (char) ((uniVal - 0xAC00) / 28 / 21);
			//중성순서 = 한글문자코드 - 0xAC00 / 28 (종성개수로 나누고) % 21 (중성의 나머지값을 출력)
			char jung = (char) ((uniVal - 0xAC00) / 28 % 21);
			//종성순서 = 한글문자코드 - 0xAC00 % 28 (차이값에 종성의 갯수로 나눈다) 
			char jong = (char) ((uniVal - 0xAC00) % 28);
			System.out.println(choSung[cho] + jungSung[jung] + jongSung[jong]);
		
		}
	}
}
