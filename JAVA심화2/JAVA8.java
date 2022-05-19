package JAVA2;

public class JAVA8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k42_i = 1; k42_i < 13; k42_i++) { // 변수 i를 12까지 반복한다
			System.out.printf(" %d월 =>", k42_i); // 변수 i를 12까지 1씩 증가시키면서 반복 출력해준다.
			for (int k42_j = 1; k42_j < 32; k42_j++) { // 변수 j를 31까지 반복 1씩 증가시키면서 출력한다.

				System.out.printf("%d,", k42_j); // 변수 j를 출력해준다. 개행처리를 하지않는다.

				if ((k42_i == 4 || k42_i == 6 || k42_i == 9 || k42_i == 11) && (k42_j == 30)) //if 변수i가 4 6 9 11 이면서 j가 30이라면
					break; //브레이크로 나온다.
				if (k42_i == 2 && k42_j == 28) //if 변수i가 2이면서 변수j가 28이라면 
					break; //브레이크로 나온다.
			}
			System.out.printf("\n"); ////for문 안에서 각 출력마다 개행처리를 한다. 
		}
	}
}
