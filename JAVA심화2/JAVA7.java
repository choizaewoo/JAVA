package JAVA2;

public class JAVA7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k42_i = 1; k42_i < 13; k42_i++) { //변수 i를 12까지 반복한다.
			System.out.printf(" %d월 =>" ,k42_i); //변수 i를 12까지 1씩 증가시키면서 반복 출력해준다. 
			for (int k42_j = 1; k42_j < 32; k42_j++) { //변수 j를 31까지 반복 1씩 증가시키면서 출력한다. 

				System.out.printf("%d," ,k42_j); //변수j를 출력한다.

				if (k42_i == 4 || k42_i == 6 || k42_i == 9 || k42_i == 11) { //만약 변수 i가 4 6 7 9 11과 같을 때
					if (k42_j == 30) break; //만약 변수 j가 30과 같으면 브레이크로 나온다.
				}
				if (k42_i == 2) { //만약 변수 i가 2와 같을 때
					if (k42_j == 28) break; //만약 변수j가 28이라면 브레이크로 나온다.
				}
			}
			System.out.printf("\n"); // //for문 안에서 각 출력마다 개행처리를 한다. .
		}
	}
}
