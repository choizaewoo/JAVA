package JAVA2;

public class JAVA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int sum = 0; //sum을 초기화 시켜준다
	//	for (int i = 0; i < 10; i++) { // i를 9까지 돌린다. 
	//		sum = sum+i; //합계에 1부터 9까지 더해준다.
	//	}
	//	System.out.printf("sum : %d\n", sum); //합계를 출력해준다.
		
		
		for (int i=1; i < 10; i++) { //i를 1부터 9까지 반복한다.
			System.out.printf("******************\n"); 
			System.out.printf("구구단 %d 단\n",i); //구구단 1단 ~ 구구단 9단 출력.
			System.out.printf("******************\n"); 
			for (int j = 1; j < 10; j++) { // j를 1부터 9까지 반복한다.
				System.out.printf(" %d * %d = %d\n", i, j, i * j); //i값에 1이 들어간다. j값에 1부터 9까지 돌아가고 i*j값이 출력된다.
				//다시 i의 for문으로 올라가서 반복한다.
			}
		}
	}

}
