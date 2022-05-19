package JAVA8; //실제 파일에 응용

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA3 {
	// throws IOException 예외를 강제로 실행시켜주는 선언문임. //예외가 발생하면 해당클래스에서 벗어난다.
	public static void main(String[] args) throws IOException {
		//객체를 생성해준다. csv File을 불러온다.
		File k42_f = new File("C:\\Users\\kopo\\folder\\무료와이파이정보경기도.csv");
		//BufferedReader 객체를 생성하고 filereader 객체를 통해서 데이터를 reading한다.
		BufferedReader k42_br = new BufferedReader(new FileReader(k42_f));
		//문자열 readtxt변수를 선언한다.
		String K42_readtxt;
		//문자열 readtxt와 파일의 내용을 읽어들인 내용을 readtxt에 저장되고 그 내용이 null일 떄
		if ((K42_readtxt = k42_br.readLine()) == null) {
			//빈파일입니다를 출력한다.
			System.out.printf("빈 파일입니다\n");
			return; //내용이 없을 때 반환
		}
		//문자열 filed_name 배열을 선언하고 readtxt를 ,로 쪼개진 내용을 field_name 배열에 저장해준다.
		String[] k42_field_name = K42_readtxt.split(",");
		int k42_LineCnt = 0;
		//파일을 한줄씩 읽은 내용을 readtxt에 저장되고 그 내용이 null이 아닐 때 
		while ((K42_readtxt = k42_br.readLine()) != null) {
			//readtxt에 저장된 내용을 ,만큼 쪼갠다.
			String[] field = K42_readtxt.split(",");
			//0번째 항목을 출력한다.
			System.out.printf("**[%d번째 항목]***********\n", k42_LineCnt);
			//for문을 통해 변수 j를 0부터 field_name.length까지 반복수행한다.
			for (int j = 0; j < k42_field_name.length; j++) {//반복문이 돌 때마다 하나씩 증가시키면서 수행한다.
				//쪼개진 field_name 배열과 field 배열을 출력한다.
				System.out.printf(" %s : %s\n", k42_field_name[j], field[j]);
			}
			System.out.printf("*********************************\n");
			//LinCnt가 100이라면 브레이크문을 통해서 나가고 Cnt를 추가한다.
			if (k42_LineCnt == 100)
				break;
			k42_LineCnt++;
		}
		//나간다.
		k42_br.close();
	}

}
