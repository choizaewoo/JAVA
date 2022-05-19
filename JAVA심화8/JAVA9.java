package JAVA8; //파일 훑어보고 감잡기

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA9 {

	//throws 이용시 클래스를 import를 해주어야한다. main클래스옆에 throws IOException 작성.
	public static void main(String[] args) throws IOException { 
		
		File f = new File("C:\\Users\\kopo\\day_data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f)); //버퍼로 읽어오기
		//읽고 bufferedReader로 보낸다 
		String readtxt; // 문자열 변수 readtxt를 선언한다.
		int LineCnt = 0; //하나씩 읽어들인다.
		int n = - 1; // 읽은 갯수
		StringBuffer s = new StringBuffer(); //StringBuffer로 문자열을 읽어들인다.
		while(true) { //조건식의 결과가 만족(true) 한다면 무한반복문을 수행한다.
			char[] ch = new char[1000];// 한개씩읽어서 1000개까지 읽는다
			
			n = br.read(ch); // 배열로 만들고 read한다.  1000개가 맥시멈인데 있으면 
			
			if (n == -1) //마지막 -1값이 없으면 (n이 -1이면) while문을 빠져나온다는 뜻. 
				break; // n이 -1 일때 없으면 빠져나온다. 
			
			//char 배열만큼 반복한다.
			//for문 사용한 방법
//			for (int i = 0; i < n; i++) {
//				if (ch[i] == '\n') { //개행처리를한다면 
//					//toString메소드는  file클래스에서는 의미가 있는 메소드다.자신이 가진 해당 경로값을 리턴해준다.
//					System.out.printf("[%s]***\n",s.toString());//객체 s가 가지고 있는 정보 또는 값을 문자열로 출력한다.
//					s.delete(0, s.length()); //0번째부터 s.length까지 삭제한다. 
//					//
//				}else {
//					s.append(ch[i]);
//				}
//			 }
			for (char c : ch) { //위에서 읽은 ch 1000개를 한개씩 character로 만들 때 사용한다.
				if (c == '\n') { //개행처리를한다면 
					//toString메소드는  file클래스에서는 의미가 있는 메소드다.자신이 가진 해당 경로값을 리턴해준다.
					System.out.printf("[%s]***\n",s.toString());//객체 s가 가지고 있는 정보 또는 값을 문자열로 출력한다.
					s.delete(0, s.length()); //0번째부터 s.length까지 삭제한다. 
					//
				}else {
					s.append(c);
				}
			}
			LineCnt++; //하나씩 증가시키며 1000개까지 반복문을 수행한다.
		}
		System.out.printf("[%s]***\n",s.toString());//객체 s가 가지고 있는 정보 또는 값을 문자열로 출력한다.
		br.close(); //reading을 정상적으로 수행하기 위해 꼭 close()를 해준다.
	}

}
