package JAVA2;

public class JAVA_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_n, k42_m; // 정수형 변수 n과 m을 선언해준다.
		k42_m = 20; // m값으로 20을 넣어준다.
		k42_n = 1; // n값으로 1을 넣어준다.

		while (true) { // 조건문의 결과가 true일 때까지 반복한다.
			for (int i = 0; i < k42_m; i++) // for문 i가 0부터 m까지 1씩 증가시킨다.
				System.out.printf(" ");// i가 m까지 반복하면서 블랭크를 하나씩 늘린다.
			for (int i = 0; i < k42_n; i++) // for문 i가 0부터 n까지 1씩 증가시킨다.
				System.out.printf("*");// 별을 하나씩 늘리면서 출력한다.
			System.out.printf("\n"); // 출력마다 개행처리를 한다.

			k42_m = k42_m - 1; // 20에서 하나씩 빠지고있다
			k42_n = k42_n + 2; // 2개씩 늘리고있다.

			if (k42_m < 0)
				break;
		}
	}

}
