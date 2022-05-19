package JAVA2;

public class JAVA_17 {

	public static void main(String[] args) {
		for (int k42_i = 1; k42_i < 13; k42_i++) {// 변수 i를 12까지 1씩 증가시키면서 반복한다
			System.out.printf(" %d월 =>", k42_i); // 변수 i를 출력한다.
			LOOP: for (int k42_j = 1; k42_j < 32; k42_j++) { // 변수j를 1부터 31까지 1씩 증가시키면서 반복한다.
				System.out.printf("%d", k42_j); // 변수 j를 출력한다.

				switch (k42_i) { // switch 괄호안에 변수를 지정한다.
				case 4: // 변수i가 4일 때 if문을 출력한다. 
				case 6: // 변수i가 6일 때 if문을 출력한다.  
				case 9: // 변수i가 9일 때 if문을 출력한다. 
				case 11: // 변수i가 11일 때 if문을 출력한다. 
					if (k42_j == 30) // 변수j가 30이라면
						break LOOP; // LOOP를 탈출한다.

					break; // 브레이크로 나간다.
					
				case 2: // 변수j가 2일 때 if문을 출력한다. 
					if (k42_j == 28) // 변수j가 28이라면
						break LOOP; // LOOP를 탈출한다.
					
					break; // 브레이크로 나간다.

				}
			}
			System.out.printf("\n"); // for문 안에서 각 출력마다 개행처리를 한다.
		}
	}

}
