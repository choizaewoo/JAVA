package JAVA2;

public class JAVA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_iVal; //int 정수형 변수 iVal을 선언.
		for (int k42_i = 0; k42_i < 300; k42_i++) { //i를 0부터 299까지 반복한다. 1씩 증가시키면서.
			k42_iVal = 5 * k42_i; // 5 10 15 20 25 30 35 .. 1495 (299까지 도니까)
			if (k42_iVal >= 0 && k42_iVal < 10) { //if문. 만약 iVal변수가 0보다 크거나 같으면서 10보다는 작으면 ~
				System.out.printf("일 %d\n", k42_iVal); // 일에는 0이랑 5밖에 안 들어감. 10보다 작은 게 5*0 5*1 뿐이니까.
			} else if ( k42_iVal >= 10 && k42_iVal < 100) { // 10보다 크거나 같으면서 100보다 작으면 
				System.out.printf("십 %d\n", k42_iVal); // 5*2 ~ 5 *19 까지 나올듯
			} else if ( k42_iVal >= 100 && k42_iVal < 1000) { //100보다 크거나 같으면서 1000보다 작으면
				System.out.printf("백 %d\n", k42_iVal); // 5*20 ~ 5*195 까지 나옴
			} else {  //위에꺼 전부 아니면~~~
				System.out.printf("천 %d\n", k42_iVal); //나머지 전부 출력.
			}
		}
	}

}
