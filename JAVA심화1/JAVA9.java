package JAVA;

public class JAVA9 {

	public static void main(String[] args) {
		
		String [] k42_item = {"초코송이","프링글스","칸쵸","초코파이","카스타드"}; //string 배열로 문자를 item변수로 받는다.
		int [] k42_price = {1000,2000,3000,2500,1000}; //int 정수형 배열로 정수가 price 변수로 들어간다.
		int [] k42_amount = {10,2,1,3,5}; //int 정수형 배열로 정수가 amount 변수로 들어간다.
		double k42_tax_rate = 0.1; //세율로 실수형 함수 double로 쓴다. 0.1이 들어간다.
		int k42_total_sum = 0; // 총합은 항상 초기화를 시켜준다. 정수형으로 받는다.
		
		System.out.printf("***********************************\n");//보기좋게 나눈다. 영수증 상단.
		System.out.printf("                영수증                 \n"); //영수증 입력. \n으로 줄나누기
		System.out.printf("항목		단가     수량      합계     \n"); //각 문자들을 tap키로 칸을 나눠주면 편하다.
		for (int k42_i = 0; k42_i < k42_item.length; k42_i++) { //배열에 들어갈 정수형 변수 i를 0부터 item길이까지 돌린다. 즉 5개를 돌린다는 뜻. i++은 i가 한번씩 돌고 5번까지 돈다는 뜻이다.
			int k42_sum = k42_price[k42_i] * k42_amount[k42_i]; //i가 1로 들어가면 배열에 들어가는 첫번째 item인 초코송이, amount는 10개이므로 sum은 10000으로 나오게된다.
			k42_total_sum = k42_total_sum + k42_sum; // 10000으로 나온 값에 총합 가격을 더해줘서 총합가격을 출력하게 되는데. 처음 1번이 돌았고 현재까지 총합이 0이기 때문에 10000만 출력된다. 
			//이렇게 계속 1부터 5까지 반복되는 상황을 알 수 있다.
			System.out.printf("%.5s		%4d %5d %9d\n", k42_item[k42_i], k42_price[k42_i], k42_amount[k42_i], k42_sum); //각각 아이템 단가 수량 합계를 문자열 s로 받아주고 정수형 d로 받아준다.
			//출력을 하게되면 아래 그림 처럼 나온다. i가 1번부터 5번까지 반복해서 열심히 돌아줬기 때문이다.
		}
		System.out.printf("************************************\n"); //보기좋게 
		System.out.printf("지불금액:		%20d\n", k42_total_sum); //1번부터 5번까지의 sum의 total_sum을 지불금액으로 출력한다.
	
		int k42_total_netprice = (int)(k42_total_sum/(1 + k42_tax_rate)); //위에 변수 tax_rate를 설정할 때 double 실수형 로 설정해줬기 때문에 int 형변환을 시켜줘야한다.
		//세금에 손해를 안보려면 무조건 +1을 해주어야한다. 
		System.out.printf("물건가격:		%20d\n", k42_total_netprice);//총도매가격을 넣어준다. 
		int k42_tax = k42_total_sum - k42_total_netprice; //세금은 총구매가격에서 총 도매가격을 빼준 금액을 넣어준다.
		System.out.printf("세  금:		%20d", k42_tax); //세금 출력
		
		
	}

}
