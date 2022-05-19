package JAVA;

public class JAVA13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.printf("***************************************************************\n");//보기좋게
		System.out.printf("*			(정확한)수수료 적용 환전		      *\n"); //보기좋게 넣어준다
		System.out.printf("총 수수료 : %d원 => 미화: %d달러 달러당 수수료: %f\n", k42_i_totalCom, k42_usd, k42_ComPerOne);//각각 넣어서 출력해준다.
		
		k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx - k42_i_totalCom); //잔돈을 형변환해서 넣어준다.
		System.out.printf("총 한화 환전 금액: %d원 => 미화: %d달러 수수료징구: %d원 잔돈: %d원\n", k42_MyWon, k42_usd, k42_i_totalCom, k42_remain); //각각 출력해준다.
		System.out.printf("***************************************************************\n");
	}

}
