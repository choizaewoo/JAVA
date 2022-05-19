package JAVA4;

import java.text.DecimalFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Scanner;

public class JAVA4 {
	public static String k42_subStrByte(String k42_source, int k42_cutLength) {
		//isEmpty는 객체가 존재하지만 그 객체가 비어있을 때 true를 반환해준다.
		//공백의 경우 공백도 객체안에 내용이 존재한다고 판단하여 false로 출력한다.
		if (!k42_source.isEmpty()) { //문자열이 비어있다면
			k42_source = k42_source.trim(); //trim을 이용하여 문자열 앞뒤의 공백을 제거한다.
			//바이트의 길이를 구해준다.
			//기본인코딩이 UTF-8이 되어있을 경우 한글은 한글자당 3바이트씩 계산된다.
			//한글자당 2바이트씩 출력되게 하도록 인코딩을 설정한다.
			if (k42_source.getBytes().length < k42_cutLength) {
				//자를 바이트 수에서 문자열의 길이만큼 빼준다.
				for (int k42_i = k42_cutLength - k42_source.getBytes().length; k42_i > 0; k42_i--) {
					//공백을 추가해준다.
					k42_source += " ";
				}
				//공백처리된 문자열을 반환해준다.
				return k42_source;
			} else { //그렇지않으면
				//StringBuffer 자료형은 append메소드를 사용한다.
				//문자를 하나씩 들여오는 StringBuffer 객체를 생성하고 인스턴스 생성
				StringBuffer k42_sb = new StringBuffer(k42_cutLength);
				//입력된 문자열을 분리하고 낱말하나씩 바이트를 구하는 정수형 변수 생성
				int k42_cnt = 0;
				//문자열을 바이트로 알파벳이나 한글(낱말)을 쪼개서 하나씩 대입한다.
				for (char k42_ch : k42_source.toCharArray()) {
					//원소 바이트크기를 계산해서 하나씩 추가해준다.
					k42_cnt += String.valueOf(k42_ch).getBytes().length;
					//누적시킨 cnt가 설정된 최대문자출력 값보다 크다면
					if (k42_cnt > k42_cutLength)
						//브레이크문으로 나간다
						break;
					//계산된 문자를 추가하여 전체 문자중 출력될 문자를 선별함
					k42_sb.append(k42_ch);
				}
				//한글은 2바이트 짝수이므로 누적된 바이트 값이 홀수일 경우 문제가 발생할 수 있음
				//따라서 설정 출력 바이트보다 하나 적은 경우 띄어쓰기 공백을 하나 추가하여 오류를 방지
				if (k42_sb.toString().getBytes().length == k42_cutLength - 1) {
					//공백을 추가한다.
					k42_sb.append(" ");
				}
				// 객체 문자형 변수로 변환해서 반환
				return k42_sb.toString();
			}
		} else {
			return ""; // 문자열이 공백일 때는 공백 반환
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k42_df = new DecimalFormat( "###,###"); //DecimalFormat클래스를 이용한다. 자동으로 import해온다.
		//scanner로 출력한다.
		//정수형 변수를 iprice로 선언하고 nextInt()형으로 받아준다. 정수형으로 받아준다.
		int k42_iPrice = 30000;
		//변수 iprice를 10으로 나눠주고 부가세에 저장한다.
		int k42_iTax = k42_iPrice / 10;
		// 총가격을 가격과 부가세를 더해준 값으로 저장한다.
		int iSum = k42_iPrice + k42_iTax;
		//영수증 출력값을 적어준다.
		System.out.printf("신용승인\n");
		//영수증 출력값을 적어준다. 
		System.out.printf("단말기 : 2N68665898          전표번호 : 041218\n");
		//영수증  출력값을 적어준다.
		System.out.printf("가맹점 : 한양김치찌개\n");
		//영수증 출력값을 적어준다.
		System.out.printf("%s","주소 : 경기 ");
		System.out.printf("%s","성남시 분당구 ");
		System.out.printf("%s\n", "황새울로351번길 10 .");
		System.out.printf("%s\n", "1층");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 752-53-00558            TEL : 7055695\n");
		//개행처리를 한다.
		System.out.printf("---------------------------------------------\n");
		//개행처리를 한다.
		System.out.printf("---------------------------------------------\n");
		System.out.printf("%s %39s원\n", "금액",k42_df.format(k42_iPrice));
		//공급액을 decimal로 포맷하여 콤마를 찍어준다.
		System.out.printf("%s %36s원\n", "부가세 ",k42_df.format(k42_iTax));
		//부가세를 decimal로 포맷하여 콤마를 찍어준다.
		System.out.printf("%s %39s원\n", "합계",k42_df.format(iSum));
		//총금액을 decimal로 포맷하여 콤마를 찍어준다.
		System.out.printf("---------------------------------------------\n");
		//개행처리를 한다.ㄴ
		System.out.printf("우리카드\n");
		//영수증 출력값을 적어준다.
		System.out.printf("카드번호 : 5387-20**-****-4613(S)      일시불\n");
		//영수증 출력값을 적어준다.
		Calendar calt = Calendar.getInstance();
		//calendar클래스로 현재시간을 불러와준다.
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.printf("거래일시 : %s\n", sdt.format(calt.getTime()));
		//영수증 출력값을 적어준다.
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873793\n");
		System.out.printf("매입 : 비씨카드사        가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("---------------------------------------------\n");
		System.out.printf("		  *감사합니다*				\n");
		System.out.printf("		            표준V2.08_20200212");
	}

}
