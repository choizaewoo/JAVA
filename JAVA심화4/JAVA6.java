package JAVA4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JAVA6 {
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
		//Date클래스를 이용하여 현재 날짜를 출력하면 영문으로 된 날짜를 리턴한다.
		//특정 문자열 포맷으로 얻고 싶으면 java.text.SimpleDateFormat 클래스를 이용하면 된다
		//yyyMMdd를 이용하여 현재시간을 출력한다.
		SimpleDateFormat k42_sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar k42_c1 = Calendar.getInstance();
		String k42_strToday = k42_sdf.format(k42_c1.getTime());

		DecimalFormat k42_df = new DecimalFormat("###,###,###,###,###");

		String[] k42_itemName = { "칸초", "미니언즈 젤리", "미니언즈 오렌지", "갤럭시버즈", "에어팟", "치킨", "TV", "삼다수 2L", "찰떡아이스크림",
				"베스킨라빈스31", "닭가슴살 6개입", "소고기맛 치킨너겟", "블루베리스무디", "케찹맛 머스타드", "뽀로로맥주6개입", "프리미엄요거트스무디", "비비고비빔국수",
				"크랜베리 콘푸로스트", "바나나우유10개입", "진라면소컵(매)65g*6", "피로회복 자양강장제 박카스5개입", "홈런볼 민트초코", "불닭볶음면 5개입", "CJ 비비고칩 20G",
				"흑원당 말차 밀크티", "스타벅스 커피빈", "프리미엄한우1등급채끝살"};
		int[] k42_price = { 5500, 6900, 5980, 3300, 255500, 3380, 66666610, 2750, 1080, 4980, 2480, 7920, 4980, 4980,
				7130, 3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 1280, 1227980};
		int[] k42_amount = { 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1 };
		boolean[] k42_taxFree = { false, false, true, false, false, false, false, false, false, false, false, true,
				false, true, true, false, false, false, false, false, false, false, false, false, false, false, false };
		int k42_totalSum = 0; // 총 가격을 정수형으로 받아준다.
		int k42_yesTaxFree = 0; //면세가격을 정수형으로 받아준다.
		int k42_noTaxFree = 0; //과세가격을 정수형으로 받아준다.
		int k42_point = 0; //포인트 정수형으로 받아준다.
		int k42_alreadyPoint = 5473; //이미 정해져있는 포인트
		int k42_afterPoint = 0; // 포인트 적립 정수형 변수.

		int supplyPrice = 0; //공급가액을 설정해준다
		k42_point = k42_totalSum / 10000;
		k42_afterPoint = k42_alreadyPoint + k42_point;
		
		int k42_getSu = k42_itemName.length; // 문자열 itemName의 총 갯수를 출력하도록 
		//정수형 변수를 설정한다.
		
		System.out.printf("\n"); //칸을 띄어준다.
		System.out.printf("     %s", "emart"); 
		System.out
				.printf("    이마트 죽전점 (031)888-1234 \n              206-26-50913 강희석\n              용인 수지구 포은대로 552\n");
		System.out.printf("\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		//영수증의 상단 내용을 출력해준다.
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		//영수증의 상단 내용을 출력해준다.

		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");		
		//영수증의 상단 내용을 출력해준다.
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		//영수증의 상단 내용을 출력해준다.
		System.out.printf("\n");
		Calendar k42_calt = Calendar.getInstance(); //calendar 클래스를 통하여 시간을 출력해준다. 
		SimpleDateFormat k42_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); 
		SimpleDateFormat k42_sdtt = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); 
		//calendar 클래스를 통하여 시간을 출력해준다.
		System.out.printf("%s%s %17s\n", "[구 매]", k42_sdt.format(k42_calt.getTime()), "POS:0011-9861");//calendar 클래스를 통하여 시간을 출력해준다.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%7s %15s %2s %5s \n", "상 품 명", "단 가", "수량", "금 액");
		

		//문자열 길이만큼 i를 돌려준다.
		for (int k42_i = 0; k42_i < k42_itemName.length; k42_i++) {
			//배열을 5칸로 나누기 위해서 5로 나누어떨어지면 개행처리를 하도록 만듬.
			if (k42_i % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
			// 구매금액을 가격 * 구매량으로 저장한다.
			int k42_sum = k42_price[k42_i] * k42_amount[k42_i];
			// boolean 논리자료형을 사용하여 면세물품이면 true 과세물품이면 false로 출력한다. 
			if (k42_taxFree[k42_i] == true) { // 면세물품이면
				k42_yesTaxFree += k42_price[k42_i]; // 가격을 면세품목에 추가한다
				//subStrByte로 16바이트로 쪼개어 공백포함 문자열을 출력한다. 
				//decimalformat을 통하여 가격과 면세물품 총가격을 세자리씩 콤마찍어 출력한다. 
				System.out.printf("* %6s%10s%2d%11s\n", k42_subStrByte(k42_itemName[k42_i], 16),
						k42_df.format(k42_price[k42_i]), k42_amount[k42_i], k42_df.format(k42_sum));
			} else if (k42_taxFree[k42_i] == false) { // 면세물품이 아니면
				//과세가격에 과세물품가격 * 과세물품수량을 곱해서 저장한 금액을 모두 저장한다.
				k42_noTaxFree += k42_price[k42_i] * k42_amount[k42_i]; // 과세물품가격에 가격을 추가한다.
				//subStrByte로 16바이트로 쪼개어 공백포함 문자열을 출력한다. 
				//decimalformat을 통하여 가격과 과세물품 총가격을 세자리씩 콤마찍어 출력한다. 
				System.out.printf("  %6s%10s%2d%11s\n", k42_subStrByte(k42_itemName[k42_i], 16),
						k42_df.format(k42_price[k42_i]), k42_amount[k42_i], k42_df.format(k42_sum));
			}
			//과세물품을 1.1로 나누어 정수형으로 형변환하여 공급가액으로 저장한다. 부가세를 구하기 위함이다. 
			supplyPrice = (int) (k42_noTaxFree / 1.1); 
			//총액은 과세물품과 면세물품의 합을 저장해준 것이다. 
			k42_totalSum = k42_yesTaxFree + k42_noTaxFree;
			
			
		}
		
		System.out.printf("\n");
		//총 품목 수량으로 정수형 getsu변수로 출력해준다.
		System.out.printf("%22s %13d\n", "총 품목 수량", k42_getSu);
		//면세물품가격의 총합을 yesTaxFree변수로 출력해준다.
		System.out.printf("%23s %13s\n", "(*)면세    물품", k42_df.format(k42_yesTaxFree));
		//과세물품의 총가격으로 supplyPrice (공급가액)변수로 출력해준다.
		System.out.printf("%23s %13s\n", "과세    물품", k42_df.format(supplyPrice));
		//부가세를 구하기 위해 noTaxFree (과세물품총합)에서 supplyPrice(공급가액)을 빼준 금액을 출력해준다.
		System.out.printf("%24s %13s\n", "부   가   세", k42_df.format(k42_noTaxFree - supplyPrice));
		//합계를 구하기 위해 totalSum 변수으로 출력해준다.
		//decimal클래스를 이용해서 세자리씩 콤마를 찍는다.
		System.out.printf("%25s %13s\n", "합        계", k42_df.format(k42_totalSum));
		//결제대상금액을 구하기 위해 totalSum 변수으로 출력해준다. 
		//decimal클래스를 이용해서 세자리씩 콤마를 찍는다.
		System.out.printf("%s %23s\n", "결 제 대 상 금 액", k42_df.format(k42_totalSum));
		//개행처리한다
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB 하나          54177*45/465461213\n");
		//일시불금액을 구하기 위해 totalSum 변수으로 출력해준다.
		System.out.printf("%s%16s%s\n","카드결제(IC)","일시불 / ", k42_df.format(k42_totalSum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n", "[신세계포인트 적립]");
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		//point적립을 위해 alreadyPoint변수와 afterPoint변수를 가져온다.
		System.out.printf("%s%20s%7s\n", "금회발생포인트","94546**11111", k42_df.format(k42_point));
		System.out.printf("%s %15s(%7s)\n", "누계(가용)포인트", k42_df.format(k42_afterPoint),
				k42_df.format(k42_alreadyPoint));
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n", "구매기준 무료주차시간 자동부여");
		System.out.printf("차량번호 :                       34저****\n");
		//시간을 출력하기위해 calendar클래스를 불러온다.
		System.out.printf("%s%31s\n","입차시간 :",k42_sdtt.format(k42_calt.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양00                     1150\n");
		System.out.printf("      ||||||||||||||||||||||||||||||||  \n");
		System.out.printf("      ||||||||||||||||||||||||||||||||  \n");
		//현재시간을 -와 /를 사용하지 않고 출력하는 방법으로 strToday를 출력하였습니다.
		System.out.printf("%16s%s", k42_strToday, "/0011123/00164890/31");

	}
	//cutString문자열을 반환하는 함수(메소드)를 선언
	public static String cutString(String k42_a) {
		//문자열 a를 0부터 14앞까지 substring하여 문자열을 쪼갠다.
		String cut = k42_a.substring(0, 14);
		return cut;
	}

}
