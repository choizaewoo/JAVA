package JAVA4;

public class JAVA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1단부터 9단까지 단 출력. i+3은 그다음 단수를 3단씩 늘리기 위함이다.
		// i를 1부터 9까지 반복하여 수행한다.
		// 아래로 3단까지만 표현하기에 1단부터 3단까지 출력한다.
		for (int k42_i = 1; k42_i < 4; k42_i++) {
			System.out.printf("**************\t**************\t**************\n");
			// 3단씩 오른쪽으로 증가하여 i+6까지 표현하기 위한 문장
			System.out.printf(" 구구단 %d 단  \t 구구단 %d 단   \t  구구단 %d 단  \n", k42_i, k42_i + 3, k42_i + 6);
			System.out.printf("**************\t**************\t**************\n");
			for (int k42_j = 1; k42_j < 10; k42_j++) { // 단수에 1부터 9까지 반복적으로 곱하기 위한 식
				// i * j 출력
				System.out.printf(" %d * %d = %d  \t", k42_i, k42_j, k42_i * k42_j);
				// i+3 * j 출력
				System.out.printf(" %d * %d = %d  \t", k42_i + 3, k42_j, k42_i + 3 * k42_j);
				// i+6 * j 출력
				System.out.printf(" %d * %d = %d  \t\n", k42_i + 6, k42_j, k42_i + 6 * k42_j);
				// 단수에 1부터 9까지 반복적으로 곱하기 위한 식이다.
				// 위에서 1단씩 오른쪽으로 추가하기 때문에 각각 표현.
			}
		}
	}
}

