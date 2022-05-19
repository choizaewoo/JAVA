package JAVA4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class practice {

	 public static String k26_subStrByte(String k26_source, int k26_cutLength) {   // 문자를 원하는 개수까지만 출력, 문자열과 출력할 최대 문자 수를 입력
	      if (!k26_source.isEmpty()) {    // 문자열이 공백이 아니라면 = 문자열이 존재한다면 아래의 명령을 진행
	         k26_source = k26_source.trim(); // 문자열 처음과 끝의 공백을 제거
	         if (k26_source.getBytes().length <= k26_cutLength) {    // 문자열의 크기를 바이트로 환산하여 크기를 계산, 한글은 2바이트 그 외 문자는 1바이트로 계산
	          // 설정한 최대문자출력크기가 입력받은 문자의 크기 이상이면
	            for (int k26_i = k26_cutLength - k26_source.getBytes().length; k26_i > 0; k26_i--) {   // 부족한 만큼을 띄어쓰기 추가
	               k26_source += " "; 
	           }
	            return k26_source; // 띄어쓰기가 추가된 문자를 반환
	         } else { // 최대출력 문자보다 입력받은 문자가 크다면 
	            StringBuffer k26_sb = new StringBuffer(k26_cutLength);// 문자를 하나씩 들여오는 객체를 생성하고 인스턴스 생성
	            int k26_cnt = 0;   // 입력된 문자열을 분리하고 낱말하나씩 바이트를 구하는 정수형 변수 생성
	            for (char k26_ch : k26_source.toCharArray()) { // 문자열을 바이트로 낱말 혹은 알파벳으로 분리했 때, 원소를 하나씩 대입한다
	               k26_cnt += String.valueOf(k26_ch).getBytes().length; // 원소의 바이트크기를 계산하여 k26_cnt 값에 누적시킨다 
	               if (k26_cnt > k26_cutLength) { //누적시킨 k26_cnt의 값이 설정한 최대문자출력 변수의 값을 넘긴다면
	                  break; // 문자 바이트 사이즈 누적을 중지
	               }
	               k26_sb.append(k26_ch); // 계산된 문자를 추가하여 전체 문자중 출력될 문자를 선별함
	            }
	            if (k26_sb.toString().getBytes().length == k26_cutLength-1) { // 한글은 2바이트 짝수이므로 누적된 바이트 값이 홀수일 경우 문제가 발생할 수 있음
	               k26_sb.append(" "); // 따라서 설정 출력 바이트보다 하나 적은 경우 띄어쓰기 공백을 하나 추가하여 오류를 방지
	            }
	            return k26_sb.toString();// StringBuffer의 오브젝트 값 k26_sb 을 문자형 변수로 변환하여 출력   
	         }
	      } else { 
	         return ""; // 문자열이 공백일 땐 공백을 반환
	      }
	   }
	   
	   public static void k26_line() {   // 가시성을 높이기 위한 점선 함수 생성
	      System.out.println("-----------------------------------------");
	   }

	   
	   public static void main(String[] args) { // 컴파일러 실행
	      // 상품명에 대한 배열을 선언 및 초기화
	      String[] k26_itemname = {"건빵"/*, "바나나우유","오렌지주스","건포도","초코에몽",
	            "코카콜라","펩시콜라","트윅스","몰티져스","상투과자E",
	            "농심 신라면 120g*5", "남양 맛있는우유GT 저칼로리", "푸르밀 미숫가루우유", "흑원당 말차 밀크티","오뚜기 진비빔면 156g",
	            "순 유기농 바나나(봉)","브라보콘","월드콘","피코크 탄두리 닭가슴살","후라보노",
	            "케라시스 앰플 트리오","불닭볶음면","공화춘","간짬뽕","굽네갈비천왕",
	            "프리미엄생연어초밥","섬유유연제","네스카페돌체구스토","삼성비스포크120인치 tv","다이슨무선 진공청소기"*/};
	      // 상품 단가에 대한 배열을 선언 및 초기화
	      int[] k26_price = {2, 2500,3000,4000,5000,
	            10000,2800,3200,4700,300,
	            8000,1980,2630,7480,5600,
	            1200,3400,490,800,940,
	            3100,7900,7780,6410,3000,
	            2000,5000,9000,1284000,986740};
	      // 상품 구매 수량에 대한 배열을 선언 및 초기화
	      int[] k26_amount = {1,1,3,4,5,
	            7,8,4,5,6,
	            9,5,1,2,4,
	            6,3,2,2,5,
	            7,4,5,1,2,
	            10,3,6,20,2};
	      // 해당 상품의 면세 여부를 설정할 배열을 선언 및 초기화
	      boolean[] k26_taxfree = {false,true,false,false,false,
	         true,true,true,true,true,
	         true,true,true,true,true,
	         true,false,false,false,false,
	         false,false,true,true,true,
	         true,true,true,false,true};
	      
	      // 면세상품의 합계 변수 선언 및 초기화
	      int k26_taxFreeSum = 0;
	      // 과세상품의 합계 변수 선언 및 초기화
	      int k26_taxSum = 0;
	      // 면세·과세상품의 합계 변수 선언 및 초기화
	      int k26_Sum = 0;
	      
	      // 문자출력을 일관되게 하기위한 k26_subStrByte 함수를 적용한 값을 저장할 변수 선언 및 초기화
	      String name = null;
	      
	      // 단위가 큰 숫자를 세자리마다 쉼표 처리하는 객체 생성 및 인스턴스생성
	      DecimalFormat k26_df = new DecimalFormat("###,###,###,###,###");
	      // 현재시간을 출력하는 함수 선언
	      Date k26_date = new Date(); 
	      // Date함수로 받은 현재시간을 전자시계 표현을 바꿔주는 객체 생성 및 인스턴스 생성 
	      SimpleDateFormat k26_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	      SimpleDateFormat k26_sdf2 = new SimpleDateFormat("yyyyMMdd");
	      SimpleDateFormat k26_sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 입차시간용 시간 함수
	      
	      System.out.println("          이마트 죽전점 (031)888-1234"); // 영수증의 구성 문장 출력
	      System.out.println("          206-86-50913 강희석"); // 영수증의 구성 문장 출력
	      System.out.println("          용인 수지구 포은대로 552"); // 영수증의 구성 문장 출력
	      System.out.println("영수증 미지참시 교환/환불 불가"); // 영수증의 구성 문장 출력
	      System.out.println("정상상품에 한함, 30일 이내(신선 7일)"); // 영수증의 구성 문장 출력
	      System.out.println("※일부 브랜드매장 제외(매장 고지물참조)"); // 영수증의 구성 문장 출력
	      System.out.println("교환/환불 구매점에서 가능(결제카드 지참)\n"); // 영수증의 구성 문장 출력
	      System.out.printf("[구 매]%s     POS:0011-9861\n", k26_sdf.format(k26_date)); // 영수증의 구성 문장 및 현재 시간을 전자시계 형식으로 출력
	      k26_line();   // 가시성을 위한 구분 점선 
	      System.out.printf("  %-12s%6s%4s%8s\n", "상 품 명", "단 가", "수량", "금 액"); // 영수증 내역의 머리 부분
	      
	      for (int k26_i = 0; k26_i < k26_itemname.length; k26_i++) { // 등로된 상품의 수 만큼 아래의 명령을 실행
	         if (k26_i % 5 == 0 ) {   // 5로 나누었을 때 나머지가 없으면 
	            k26_line(); // 구분 점선 출력
	         }
	         
	         name = k26_subStrByte(k26_itemname[k26_i], 14); // 상품의 제한된 출력을 위한 상품명 재구성 14자리까지 출력
	         
	         if (k26_taxfree[k26_i]) {   // 면세 상품일 경우 앞에 *을 붙여서 출력
	            System.out.printf("* %-1s%10s%4d%11s\n", // 상품명은 좌측정렬하여, 자리 출력, 상품명이 들어갈 자리 값을 제한된 출력값의 절반 이하로 맞춰야 출력 형태가깔끔하게 나옴,  
	                  name, k26_df.format(k26_price[k26_i]), k26_amount[k26_i], k26_df.format(k26_price[k26_i] * k26_amount[k26_i]));
	            k26_taxFreeSum += k26_price[k26_i]* k26_amount[k26_i];
	         } else {   // 과세 상품이면 *표시없이 출력
	            System.out.printf("  %-1s%10s%4d%11s\n", // 상품명은 좌측정렬하여, 자리 출력, 상품명이 들어갈 자리 값을 제한된 출력값의 절반 이하로 맞춰야 출력 형태가깔끔하게 나옴,
	                  name, k26_df.format(k26_price[k26_i]), k26_amount[k26_i], k26_df.format(k26_price[k26_i] * k26_amount[k26_i]));
	            k26_taxSum += k26_price[k26_i]* k26_amount[k26_i];
	         }
	         
	      }
	      
	      int k26_nettax = (int) (k26_taxSum / 1.1); // 세전 가격
	      k26_Sum = k26_taxFreeSum + k26_taxSum; // 면세품의 합계 + 과세품의 합계 = 결제금액
	      
	      System.out.println("");
	      System.out.printf("%22s%14d\n", "총 품목 수량", k26_itemname.length); // 구매한 상품의 수
	      System.out.printf("%23s%14s\n", "(*)면 세  물 품", k26_df.format(k26_taxFreeSum)); // 면세품 합계액에 세자리마다 쉼표 붙여서
	      System.out.printf("%23s%14s\n", "과 세  물 품", k26_df.format(k26_nettax)); // 과세품 합계액에 세자리마다 쉼표 붙여서
	      System.out.printf("%24s%14s\n", "부   가   세", k26_df.format(k26_taxSum - k26_nettax)); // 부가세에 세자리마다 쉼표 붙여서
	      System.out.printf("%25s%14s\n", "합        계", k26_df.format(k26_Sum)); // 결제금액에 세자리마다 쉼표 붙여서
	      System.out.printf("%s %23s\n", "결 제 대 상 금 액", k26_df.format(k26_Sum)); // 결제금액에 세자리마다 쉼표 붙여서
	      k26_line(); // 가독성을 위한 구분 점선
	      
	      System.out.println("0012 KEB 하나       541707**0484/35860658"); // 영수증 구성내용
	      System.out.printf("카드결제(IC) %15s%10s\n", "일시불 /", k26_df.format(k26_Sum)); //카드결제 및 결제금액 출력 
	      k26_line(); // 가독성을 위한 구분 점선
	      System.out.println("           [신세계포인트 적립]"); // 영수증 구성내용
	      System.out.println("홍*두 고객님의 포인트 현황입니다."); // 영수증 구성내용
	      System.out.printf("금회발생포인트 %16s%10s\n", "9350**9995", k26_df.format(k26_Sum/1000)); // 영수증 구성내용, 결제 금액의 0.1%를 적립
	      System.out.printf("누계(가용)포인트 %14s (%7s)\n", "5,637", k26_df.format(5473)); // 영수증 구성내용, 가용포인트
	      System.out.println("*신세계포인트 유효기간은 2년입니다."); // 영수증 구성내용
	      k26_line();// 가독성을 위한 구분 점선
	      System.out.println("    구매금액기준 무료주차시간 자동부여"); // 영수증 구성내용
	      System.out.println("차량번호 :                       34저****"); // 영수증 구성내용
	      System.out.printf("입차시간 :            %s\n", k26_sdf3.format(k26_date)); // 입차한 시간을 현재 시간으로 출력
	      k26_line();
	      System.out.println("캐셔:084599 양OO                     1150"); // 영수증 구성내용
	      System.out.println("   1l1l1l1l1l1l1l1l1l1ll1l1l1l1l1l1l1"); // 바코드 대체
	      System.out.printf("     %s/00119861/00164980/31", k26_sdf2.format(k26_date)); // 최하단 결제 시간을 현재시간으로 출력 후 나머지 내용
	      
	   }

	}