package JAVA2;

public class JAVA9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k42_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // int형 배열 변수로 iLMD를 선언해준다. 단! 배열은 0부터
																				// 시작한다. 즉 0~ 11까지다.

		for (int k42_i = 1; k42_i < 13; k42_i++) { // for문을 돌릴건데 변수 i를 1부터 12까지 1씩 증가시키면서 반복시킬 것이다.
			System.out.printf(" %d월 =>", k42_i); // 변수 i를 출력해준다.
			for (int k42_j = 1; k42_i < 32; k42_j++) { // 다중 for문을 돌린건데 j를 1부터 31까지 1씩 증가시키면서 돌려준다.

				System.out.printf("%d일", k42_j); // 변수 j를 넣어준다.

				if (k42_iLMD[k42_i - 1] == k42_j) //if문을 사용한다. 배열에 -1을 넣어준 것은 배열이 0부터 시작하기 때문이다. iLMD[0] ~ iLMD[11]이다.
					//iLMD[0] ~ iLMD[12]의 값이 변수 j의 값고 같으면 브레이크로 나오겠다는 if문을 사용한다.
					//변수 i가 1부터 돌면 1월이 출력되고 그다음 j가 돌아서 31일까지 출력해준다. 그런데 iLMD[0]은 31이니 배열의 0번째값 31을 출력해준다. 1월은 31일까지 출력되는 것이다.
					//변수 i가 2로 돌면 2월이  출력되고 그다음 j가 돌아서 31일까지 출력된다. 그런데 iLMD[1]은 28이니 배열의 1번째값 28을 출력해준다. 2월은 28일까지 출력되는 것이다.
					//이런식으로 반복 출력됨.배열을 사용하는 경우도 좋은 사례이지만 복잡해보인다.
					break; // 브레이크로 나온다.

				System.out.printf(","); //콤마 찍기
			}
			System.out.printf("\n"); // for문 안에서 각 출력마다 개행처리를 한다.
		}
	}
}
