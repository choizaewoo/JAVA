package JAVA;

public class JAVA10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_MyWon = 1000000; //한화를 1000000으로 잡고 int 변수로 MyWon으로 넣어준다.
		double k42_MoneyEx = 1238.21; //환율은 double변수에 1238.21을 넣어준다. 
		double k42_commission = 0.003; //수수료는 double변수에 0.003을 넣어준다.

		int k42_usd = (int) (k42_MyWon / k42_MoneyEx); // 환전한 미달러를 구하려면 한화를 환율로 나눠야한다. 중요한 건 형변환이ek. int를 double형으로 나눴어도 int형으로 형변환을 해줘야한다.
		int k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx); //잔돈은 remain변수로 설정했다. 마찬가지로 형변환을해서 넣어줘야한다. ㅇ
		//잔돈은 환전한 미달러와 환율을 곱하고 내가 환전했던 원화를 빼줘야한다.

		System.out.printf("**********************************************************\n");//보기좋게
		System.out.printf("			수수료없이 계산				\n");// 보기좋게 탭탭 후 열 띄우기 \n
		System.out.printf("총 한화환전금액: %d원	=>	미화: %d 달러  	잔돈: %d 원", k42_MyWon, k42_usd, k42_remain ); //각각 출력해준다..
	}

}
