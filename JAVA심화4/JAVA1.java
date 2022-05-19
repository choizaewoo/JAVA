package JAVA4;

public class JAVA1 {

	public static void main(String[] args) {
		//1단부터 9단까지 단 출력. i+3은 그다음 단수를 3단씩 늘리기 위함이다.
		//i를 1부터 9까지 반복하여 수행한다.
		for (int k42_i = 1; k42_i < 10; k42_i = k42_i+3) {			
			System.out.printf("**************\t**************\t**************\n");
			//1단씩 오른쪽으로 i i+1 i+2까지 구현한다. 
			System.out.printf("  구구단 %d 단  \t  구구단 %d 단  \t 구구단 %d 단  \n", k42_i, k42_i + 1, k42_i + 2);
			System.out.printf("**************\t**************\t**************\n");
			//i에 곱하여 j를 구하기 위한 식. 1부터 9까지 반복수행한다. 
			for (int k42_j = 1; k42_j < 10; k42_j++) {
				//i * j 출력
				System.out.printf(" %d * %d = %d  \t", k42_i, k42_j, k42_i * k42_j);
				//i+1 * j 출력
				System.out.printf(" %d * %d = %d  \t", k42_i + 1, k42_j, k42_i + 1 * k42_j);
				//i+2 * j 출력
				System.out.printf(" %d * %d = %d  \t\n", k42_i + 2, k42_j, k42_i + 2 * k42_j);
				//단수에 1부터 9까지 반복적으로 곱하기 위한 식이다.
				//위에서 1단씩 오른쪽으로 추가하기 때문에 각각 표현.
			}
		}
	}
}
