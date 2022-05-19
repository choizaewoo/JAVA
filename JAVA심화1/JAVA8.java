package JAVA;

public class JAVA8 {
	
	public static int k42_netprice(int price, double rate) { //클래스를 설정해준 이유는 깔끔하게 보이기 위해서다.
		return (int)(price/(1+rate)); //나중에 가져올 값들이다. 여기서 계산 후 끌어다가 내린다. 1234를 1.1로 나누면 1121.81818이 나온다 . 정수형으로 형변환하면 1121.
		//즉 1121이 netprice가 된다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_price = 1234; //price를 정수형으로 1234로 넣어준다.
		double k42_rate = 0.1; //rate를 실수형으로 0.1로 넣어준다.
		
		int k42_netprice = k42_netprice(k42_price,k42_rate); //설정된 클래스를 price와 rate를 각각 끌어가서 클래스의 리턴값으로 빼준다. 정수형으로 빼주는 것이다.
		// 즉 1121.
		int k42_tax = k42_price - k42_netprice;
		// 세금은 = 소비자가격에서 netprice를 빼준다. 113이다.
		System.out.printf("***************************************\n");
		System.out.printf("*       소비자가, 세전가격, 세금 계산         *\n");
		System.out.printf(" 소비자가격: %d 세전 가격: %d 세금: %d\n", k42_price, k42_netprice, k42_tax);//소비자가격 순가격 세금순으로 출력된다.
		System.out.printf("***************************************\n");
	
	}
}
