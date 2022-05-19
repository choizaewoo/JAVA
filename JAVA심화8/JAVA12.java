package JAVA8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JAVA12 { // 20120126 모든종목 출력 파일

	public static void main(String[] args) throws IOException {
		// 현재시간을 불러온다. 현재부터 언제까지 출력되는지 시간을 명확하게 표현하기 위해서
		SimpleDateFormat k42_sdt = new SimpleDateFormat(" HH:mm:ss");
		// 시간클래스사용 getInstatnce() 시스템정보 불러오기.
		Calendar k42_c1 = Calendar.getInstance();
		//bufferReader를 통해서 객체를 생성하고fileReader의 정보와 데이터를 긁어온다.
		File f = new File("C:\\Users\\kopo\\day_data\\StockDailyPrice.csv");
		BufferedReader k42_br = new BufferedReader(new FileReader(f));
		//bufferReader를 통해서 객체를 생성하고filewriter의 정보와 데이터를 긁어온다.
		File f1 = new File("C:\\Users\\kopo\\day_data\\20120126.csv");
		BufferedWriter k42_bw1 = new BufferedWriter(new FileWriter(f1));
		//변수를 생성한다.
		String k42_a = "20120126";
		String k42_readtxt;
		int k42_cnt = 0;
		int k42_wcnt = 0;

		System.out.printf("프로그램 시작 :%s\n", k42_sdt.format(k42_c1.getTime()));
		//반복문을 통해서 파일에 라인을 추가한다.
		while ((k42_readtxt = k42_br.readLine()) != null) {
			StringBuffer s = new StringBuffer();
			String[] field = k42_readtxt.split("%_%");
			//만약 파일에 20120126내용이 있으면 
			if (k42_readtxt.contains(k42_a)) {
				//readtxt에 추가한다.
				s.append(k42_readtxt);
				//j부터 필드의 길이까지 반복문을 생서한다.
				for (int j = 1; j < field.length; j++) {
					s.append(f1);

				}
				//문자열로 형변환시킨다.
				k42_bw1.write(s.toString());
				//라인을 추가한다.
				k42_bw1.newLine();
				//하나씩 증가시킨다.
				k42_wcnt++;
			}
			k42_cnt++;
		}
		//최고가의 시간을 생성한다.
		SimpleDateFormat sdt2 = new SimpleDateFormat("HH:mm:ss");
		Calendar c2 = Calendar.getInstance();
		k42_br.close();//나가기
		k42_bw1.close(); //나가기
		System.out.printf("프로그램 종료 : %s\n 읽은 수 : %d 저장된 파일 수 : %d \n", sdt2.format(c2.getTime()), k42_cnt, k42_wcnt);
	}
}
