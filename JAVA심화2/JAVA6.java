package JAVA2;

public class JAVA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k42_i = 1; k42_i < 13; k42_i++) { // i를 12까지 돌림. 1씩 증가시키면서.
			System.out.printf(" %d월 =>", k42_i); //i로 월을 출력합니다. 1월부터 12월까지 나옴. 
			for (int k42_j = 1; k42_j < 32; k42_j++) { // j를 31까지 돌립니다. 1씩 증가시킴.
				System.out.printf("%d일,",k42_j); // j로 일을 출력합니다.
				
				if (k42_i==1 && k42_j ==31) //i가 1이면서 j가 31이면 
					break; //브레이크로 빠져나간다. 
				if (k42_i==2 && k42_j ==28) //i가 2면서 j가 28이면
					break; //브레이크로 빠져나간다.
				if (k42_i==3 && k42_j ==31) //i가 3이면서 j가 31이면
					break; //브레이크로 빠져나간다. 
				if (k42_i==4 && k42_j ==30) //i가 4이면서 j가 30이면
					break; //브레이크로 빠져나간다.
				if (k42_i==5 && k42_j ==31) //i가 5이면서 j가 31이면
					break; //브레이크로 빠져나간다.
				if (k42_i==6 && k42_j ==30) //i가 6이면서 j가 30이면
					break;//브레이크로 빠져나간다.
				if (k42_i==7 && k42_j ==31) //i가 7이면서 j가 31이면
					break; //브레이크로 빠져나간다.
				if (k42_i==8 && k42_j ==31) //i가 8이면서 j가 31이면
					break; //브레이크로 빠져나간다.
				if (k42_i==9 && k42_j ==30) //i가 9이면서 j가 30이면
					break; //브레이크로 빠져나간다.
				if (k42_i==10 && k42_j ==31) //i가 10이면서 j가 31이면
					break; //브레이크로 빠져나간다.
				if (k42_i==11 && k42_j ==30) //i가 11이면서 j가 30이면 
					break; //브레이크로 빠져나간다.
				if (k42_i==12 && k42_j ==31) //i가 12이면서 j가 31이면
					break; //브레이크로 빠져나간다.
			
			}
			System.out.printf("\n"); ////for문 안에서 각 출력마다 개행처리를 한다. 
		}
	}

}
