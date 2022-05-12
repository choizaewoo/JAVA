package JAVA8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JAVA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { //try문 사용
			//객체를 만들어서 파일을 불러온다.
			File k42_f = new File("C:\\Users\\kopo\\Mytest.txt");
			//객체 생성
			FileWriter k42_fw =new FileWriter(k42_f);
			//write를 이용하여 파일에 내용을 입력해준다.
			k42_fw.write("안녕 파일\n");
			k42_fw.write("hello 헬로\n");
			//close를 무조건 사용한다.
			k42_fw.close();
			//파일 readrer로 객체를 생성한다.
			FileReader k42_fr = new FileReader(k42_f);
			// 변수 n에 -1을 저장한다.
			int k42_n = -1;
			//char 배열을 선언한다.
			char [] k_42ch;
			//조건식의 결과가 true라면 무한반복수행한다.
			while(true) {
				//ch 배열의 크기를 100으로 만들어준다.
				k_42ch = new char[100];
				//반복하여 100까지 넣어준다.
				k42_n = k42_fr.read(k_42ch);
				//아니라면 브레이크문을 통해서 빠져나온다.
				if(k42_n == -1) break;
				//반복문을 사용해서 출력한다.
				for(int i = 0; i < k42_n; i++) {
					System.out.printf("%c",k_42ch[i]);
				}
			}
			//reading을 close한다.
			k42_fr.close();
			//출력문
			System.out.printf("\n FILE READ END");
			//위 경우를 벗어난다면 예외처리를 해주고 출력문을 출력한다.
		}catch(Exception k42_e) {
			System.out.printf("나 에러[%s]\b", k42_e);
		}
	}

}
