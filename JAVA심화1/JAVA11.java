package JAVA;

public class JAVA11 {

	public static void main(String[] arsg) {
		// TODO Auto-generated method stub
		int k42_MyWon = 1000000;//한화를 1000000으로 잡고 int 변수로 MyWon으로 넣어준다.
		
		double k42_MoneyEx = 1238.21;//환율은 double변수에 1238.21을 넣어준다.
		double k42_commission = 0.003;//수수료는 double변수에 0.003을 넣어준다.
		
		int k42_usd = (int) (k42_MyWon / k42_MoneyEx);// 환전한 미달러를 구하려면 한화를 환율로 나눠야한다. 중요한 건 형변환이ek. int를 double형으로 나눴어도 int형으로 형변환을 해줘야한다.

		double k42_ComPerOne = k42_MoneyEx * k42_commission; // 환율과 수수료를 곱해서 달러당 수수료로 넣어준다.
		double K42_totalCom = k42_usd * k42_ComPerOne; // 환전한 달러와 달러당 수수료를 곱해서 총수수료로 넣어준다.
		
		System.out.printf("*****************************************************************\n");//보기좋게
		System.out.printf("*			    수수료 계산				*\n"); //보기좋게
		System.out.printf("총 수수료: %f원	=>미화: %d달러  	달러당 수수료: %f원", K42_totalCom, k42_usd, k42_ComPerOne);//각각 넣어준다. f는 실수형자료이다. double보다 더 작은 실수를 나타내준다.<->float
		
	}
}
