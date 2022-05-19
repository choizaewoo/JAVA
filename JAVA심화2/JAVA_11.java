package JAVA2;

public class JAVA_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumVal = 1001034567; // int 정수형 변수 iNumVal를 선언해준다.

		String sNumVal = String.valueOf(iNumVal); //String 문자열 변수 sNumVal을 선언함과 동시에 int형 정수형을 문자열 형태로 반환한다는 것을 sNumVal에 저장한다. 
		String sNumVoice = ""; //문자열 변수 sNumVoice를 ""로 선언. 

		System.out.printf("==> %s [%d자리]\n", sNumVal, sNumVal.length()); // 문자열 sNumVal을 정수형인 iNumVal을 저장해줬기 때문에 1001034567이 출력됨. sNumVal.length는 iNumVal의
		//길이 만큼 출력된다. 즉 10개가 들어가서 출력된다.

		int i, j; // int형 변수 i와 j를 각각 선언해준다.

		String[] units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // String 문자열 배열로 변수를 units으로 선언해준다. 
		String[] unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; //String 문자열 배열로 변수를 unitX로 선언해준다.

		i = 0; // 변수i를 0으로 초기화한다.
		j = sNumVal.length() - 1; // sNumVal은 String.valueOf(iNumVal)로 형변환을 시켜주었으니 iNumVal의 길이가 출력되니까 문자열길이에서 1을 빼주는 것을 변수 j로 저장한다는 것을 설정한다.
															//(int형을 string형으로 바꿔준다는 뜻임)
		while (true) { //조건식의 결과가 true면 반복 수행한다. 
			if (i >= sNumVal.length()) // if문 만약 i가 문자열 길이보다 클 때  
				break; //브레이크문을 통해서 나온다.

			System.out.printf("%s[%s]", sNumVal.substring(i, i + 1), //substring을 통해서 문자열을 쪼개서 출력할 수 있다. 만약 변수 i에 1을 넣으면 beginIndex는 1이고 endIndex는 2이다.
					// 즉 %s에는 '1'이 출력된다. 
					units[Integer.parseInt(sNumVal.substring(i, i + 1))]); // //substring을 통해서 문자열을 쪼갰고, 만약 변수 i에 1을 넣으면 beginIndex는 1이고 endIndex는 2이다.
					// 즉 문자열 1을 다시 정수형으로 변형하는 것이다. 그래서 unit[1]이 되는데 units 배열의 1번째는 "일"이다. 
			
												//문자열 비교는 equals를 쓴다.
			if (sNumVal.substring(i, i + 1).equals("0")) { // 만약 변수 i에 1을 넣었다면 (1,2)이기 때문에 숫자형 문자열 iNumVal은 1이 된다. 이게 문자열 0과 같을 때.
				if (unitX[j].equals("만") || unitX[j].equals("억")) { 
					sNumVoice = sNumVoice + "" + unitX[j];
				} else {
						//아무것도 아니라면 아무것도 안함.
				}

			} else {
				sNumVoice = sNumVoice + units[Integer.parseInt(sNumVal.substring(i, i + 1))] + unitX[j];
			}
			i++;
			j--;
		}

		System.out.printf("\n %s[%s]\n", sNumVal, sNumVoice);
	}
}
