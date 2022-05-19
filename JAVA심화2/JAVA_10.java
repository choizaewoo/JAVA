package JAVA2;

public class JAVA_10 {

	public static void main(String[] args) {
	
		String[] units = {"영","일","이","삼","사","오","육","칠","팔","구"}; //String 배열을 통해서 변수 unit을 선언한다. 배열은 0부터 시작하는 것을 숙지하는 것이 중요하다.
		for (int k42_i = 0; k42_i < 101; k42_i++) { //for문으로 변수 i를 0부터 100까지 1씩 증가시키면서 출력시킨다.
			if (k42_i >= 0 && k42_i < 100) { //if문 만약 변수 i가 0보다 크거나 같으면서 100보다 작으면 이라는 if문을 사용한다.
				int k42_i10,k42_i0; //int 정수형 변수 i10와 i0을 출력한다.
				k42_i10= k42_i/10; //변수 i10에 변수 i를 10으로 나눈 값을 저장한다.
				k42_i0 = k42_i%10; //변수 i0에 i를 10으로 나눈 나머지값을 저장해준다.
				if(k42_i0==0) { //if문 만약 i0의 값이 0과 같을 때  
					System.out.printf("십의자리 : %s십\n", units[k42_i10]); //배열 변수 units[i10]의 0번째 값으로 "영"을 넣어서 출력해준다. 즉 영십 이라고 출력된다.
				}else { // 만약 i0의 값이 0이 아니라면  (가정해서 1이 들어왔다면)
					System.out.printf("십의자리 : %s십%s\n", units[k42_i10], units[k42_i0]); //배열 변수 units[i10]의 [1]번째 값으로 "영"을 넣어서 출력해주고 units[i0]의 1번째 값으로 "일"이 출력된다.
					//즉 i가 1이면 영십일이 출력된다.
				}
			}
			else {
				System.out.printf("==> %d\n",k42_i);
			}
		}
	}
}
