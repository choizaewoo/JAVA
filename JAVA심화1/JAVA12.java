package JAVA;

public class JAVA12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_MyWon = 1000000; //한화를 1000000으로 잡고 int 변수로 MyWon으로 넣어준다.
		double k42_MoneyEx = 1238.21; //환율은 double변수에 1238.21을 넣어준다. 
		double k42_commission = 0.003; //수수료는 double변수에 0.003을 넣어준다.

		int k42_usd = (int) (k42_MyWon / k42_MoneyEx); // 환전한 미달러를 구하려면 한화를 환율로 나눠야한다. 중요한 건 형변환이ek. int를 double형으로 나눴어도 int형으로 형변환을 해줘야한다.
		int k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx); //잔돈은 remain변수로 설정했다. 마찬가지로 형변환을해서 넣어줘야한다. ㅇ
		//잔돈은 환전한 미달러와 환율을 곱하고 내가 환전했던 원화를 빼줘야한다.
		
		double k42_ComPerOne = k42_MoneyEx * k42_commission; // 환율과 수수료를 곱해서 달러당 수수료로 넣어준다. double실수형
		double K42_totalCom = k42_usd * k42_ComPerOne; // 환전한 달러와 달러당 수수료를 곱해서 총수수료로 넣어준다. double실수형
		
		int k42_i_totalCom; //총수수료를 int형으로 다시 하나 더 만들어준다.
		
		if(K42_totalCom != (double)((int)K42_totalCom)) { //총수수료를 정수형으로 바꾸고 다시 형변환을 해준다. 그리고 double형 totalCom과 비교해서 같지 않으면!!! 소수점이 다르면! 
			k42_i_totalCom = (int)K42_totalCom+1; // 은행시스템에서는 손해보면 안되기 때문에 무조건 +1을 해준다. 총수수료에 + 1을 한 정수값을 i_totalCom으로 넣어준다.
	
			System.out.printf("*****************************************************************\n");
			System.out.printf("*			수수료 적용 환전				*\n");
			System.out.printf("총 수수료: %d => 미화: %d달러 달러당수수료: %f원\n", k42_i_totalCom, k42_usd, k42_ComPerOne);
			//각각 넣어준다. 자바 타입으로 넣어봤다.
		k42_remain = (int)(k42_MyWon - k42_usd * k42_MoneyEx - k42_i_totalCom); //잔돈은 형변환을 시켜서 넣어준다. 소수점의 숫자는 뭐할라고?
			System.out.printf("총 한화 환전 금액: %d원 => 미화: %d달러 수수료징구: %d원 잔돈: %d원\n", k42_MyWon, k42_usd, k42_i_totalCom, k42_remain); //각각 넣어준다.
			System.out.printf("*****************************************************************\n");
		}
	}
}
