package JAVA;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JAVA15 {

	public static void main(String[] args) {
		
		
		int k42_MyWon = 1000000;//한화를 1000000으로 잡고 int 변수로 MyWon으로 넣어준다.
		double k42_MoneyEx = 1238.21;//환율은 double변수에 1238.21을 넣어준다.
		double k42_commission = 0.003;//수수료는 double변수에 0.003을 넣어준다.

		int k42_usd = (int) (k42_MyWon / k42_MoneyEx);// 환전한 미달러를 구하려면 한화를 환율로 나눠야한다. 중요한 건 형변환이ek. int를 double형으로 나눴어도 int형으로 형변환을 해줘야한다.
		int k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx);//잔돈은 remain변수로 설정했다. 마찬가지로 형변환을해서 넣어줘야한다. ㅇ
		//잔돈은 환전한 미달러와 환율을 곱하고 내가 환전했던 원화를 빼줘야한다.

		double k42_ComPerOne = k42_MoneyEx * k42_commission;// 환율과 수수료를 곱해서 달러당 수수료로 넣어준다. double실수형
		double k42_totalCom = k42_usd * k42_ComPerOne;// 환전한 달러와 달러당 수수료를 곱해서 총수수료로 넣어준다. double실수형
		
		int k42_i_totalCom; //총수수료를 int형으로 다시 하나 더 만들어준다.
		
		k42_usd = (int) (k42_MyWon/(k42_MoneyEx + k42_ComPerOne)); //환율과 달러당 수수료를 더해서 내가 가진 원화를 나눠준다. 그것을 형변환해서 내가 환전한 달러로 넣어준다.
		k42_totalCom = k42_usd * k42_ComPerOne; //내가 환전한 달러와 달러당 수수료를 곱해서 총수수료로 넣어준다.
		
		if (k42_totalCom != (double)((int)k42_totalCom)) { //만약 실수형 총수수료가 실수형 총 수수료가 같으면...
			k42_i_totalCom = (int)k42_totalCom+1; //총수수료에 + 1을 해주고 int 정수형으로 형변환해서 i_totalCom에 넣어준다.
		} else { //그렇지않으면
			k42_i_totalCom = (int)k42_totalCom; //1을 더해주지 않은 값을 정수형으로 형변환해서 총수수료에 넣어준다. 
			
		}
		DecimalFormat k42_df = new DecimalFormat( "###,###,###,###,###"); //DecimalFormat클래스를 이용한다. 자동으로 import해온다.
		
		System.out.printf("********************************************************************\n");
		
		Calendar k42_calt = Calendar.getInstance(); //날짜 함수로 시간을 설정해주는 방식이다. get.instance는 윈도우 시스템상의 것을 빌려오는 것이다. 그대로 나타내줌.
		SimpleDateFormat k42_sdt = new SimpleDateFormat ("YYYY/MM/dd HH:mm:ss"); //dd와 mm ss는 소문자여야한다. 
		System.out.printf("		     최종실행시간: %s\n", k42_sdt.format(k42_calt.getTime())); //DecimalFormat형식으로 현재시간과 현재날짜를 출력해준다.
		
		System.out.printf("********************************************************************\n");
		System.out.printf("*		      (정확한)수수료 적용 환전						\n");
		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n",
			k42_df.format(k42_i_totalCom),//DecimalFormat형으로 출력한다
			k42_df.format(k42_usd),//DecimalFormat형으로 출력한다
			k42_ComPerOne); 


		k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx - k42_i_totalCom);
		System.out.printf("총 한화 환전 금액: %s원 => 미화: %s달러 수수료징구: %s원 잔돈: %s원\n",
				k42_df.format(k42_MyWon), //DecimalFormat형으로 출력한다
				k42_df.format(k42_usd), //DecimalFormat형으로 출력한다
				k42_df.format(k42_i_totalCom), //DecimalFormat형으로 출력한다
				k42_df.format(k42_remain));//DecimalFormat형으로 출력한다
		
		
	
	}

}
