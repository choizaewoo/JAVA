package JAVA;

public class JAVA7 {

	public static int k42_taxcal(int k42_val, int k42_rate) { // taxcal은 세금계산 변수. val은 세전가격 rate는 세금 % 이다. ex) 3 = 3%
		int k42_ret; //
		
		if( ((double)k42_val*(double)k42_rate/100.0) == k42_val*k42_rate/100) { //if문 실수형 val와 실수형rate를 곱하고 100으로 나눈 값이 정수형 val와 정수형 rate를 곱하고 100으로 나눈값이랑 
			//같다면
			k42_ret = k42_val*k42_rate /100; //물건값과 세금을 곱한 것을 100으로 나누면 실제 세금 값을 출력해낸다. 8.17
		}else { 
			k42_ret = k42_val*k42_rate/100+1;  //실수형을 정수형만 남기기 위해 1을 더해준다. 물건값과 세금을 곱한 것을 100으로 나누고 +1을 해주면 정수형만 남는다. 
		}
			return k42_ret; //결과 값을 리턴한다
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k42_val = 271; //물건값을 271로 넣는다.
		int k42_rate = 3; // 세금을 3으로 넣는다.
		
		int k42_tax = k42_taxcal(k42_val,k42_rate); // 클래스에서 받아온 값을 tax로 넣어준다. 
		
		int k42_aftertax = k42_val + k42_tax; //물건값과 세금을 더해서 세후 물건값으로 넣어준다.
		
		System.out.printf("**********************************\n");
		System.out.printf("*           단순 세금 계산          *\n");
		System.out.printf("실제 세금 계산 : %f\n", k42_val*k42_rate/100.0); //실제 세금 계산 값은 물건값 * 세금 /100.0 
		
		System.out.printf("세전가격 : %d 세금 : %d 세금포함가격 : %d\n", k42_val, k42_tax, k42_aftertax); // 세전가격 271 세금 9 세후 280  
		System.out.printf("**********************************\n");
		
	}

}
