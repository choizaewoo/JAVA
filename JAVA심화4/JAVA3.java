package JAVA4;

public class JAVA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_iWeekday = 5; // weekday를 정수형 변수로 선언하고 5로 설정한다.
		int[] k42_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각 월의 말일을 적어둔다.
		// 1월부터 12월까지 출력한다. 1씩 증가하면서 반복문이 돈다.
		for (int k42_iMon = 0; k42_iMon < 12; k42_iMon++) {
			// 1월부터 출력을 해준다.
			System.out.printf("\n\n		      %d월\n", k42_iMon + 1);
			System.out.printf("=====================================================\n");
			System.out.printf("일	월	화	수	목	금	토\n");
			// 0부터 weekday까지 돌고 공백을 출력한다.
			for (int i = 0; i < k42_iWeekday; i++) {
				System.out.printf("	");
			}
			// 변수 i를 1부터 배열 iEnd에 넣어서 각 말일까지 추가하면서 반복문이 실행된다.
			for (int i = 1; i <= k42_iEnd[k42_iMon]; i++) {
				// 변수 i에 1부터 들어가고 31까지 돈다.
				System.out.printf("%d	", i);
				// weekday를 증가시키고 7이 되면 개행처리를 하고 0을 만들어주며 다시 반복문이 실행되도록 for문 첫줄로 올라간다.
				k42_iWeekday++;
				if (k42_iWeekday == 7) {
					System.out.printf("\n");
					// weekday를 0으로 설정하고 다시 첫줄부터 실행하게된다.
					k42_iWeekday = 0;

				}

			}
		}
	}
}
