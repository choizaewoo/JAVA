package JAVA8; //거리계산

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA16 {

	public static void main(String[] args) throws IOException {
		// File객체를 통해 file을 불러온다.
		File f = new File("C:\\Users\\kopo\\folder\\전국공영주차장정보.csv");
		// BufferedReader객체를 통해 fileReader객체의 데이터를 읽어온다.
		BufferedReader br = new BufferedReader(new FileReader(f));
		// 문자열을 변수를 선언한다.
		String k42_readtxt;

		String k42_maxPt = "";
		String k42_minPt = "";
		double k42_max = 1;
		int k42_maxNum = 0;
		double k42_min = 0;
		int k42_minNum = 0;

		// readtxt에 파일을 한줄씩 쪼갠 내용을 저장하고 그 값이 null일 때는
		if ((k42_readtxt = br.readLine()) == null) {
			// 빈 파일이라고 출력한다.
			System.out.printf("빈 파일입니다.\n");
			// 그 값을 반환한다
			return;
		}

		// readtxt파일의 내용을 탭으로 분리하여 배열 field_name에 저장한다.
		String[] k42_field_name = k42_readtxt.split(",");
		// 위도를 정해준다.
		double k42_lat = 37.3860521;
		// 경도를 정해준다.
		double k42_lng = 127.1214038;
		// LineCnt 1으로 초기화
		int k42_LineCnt = 1;
		// 한줄씩 읽어들인 내용을 readtxt에 저장하고 그 값이 nulld이 아닐 때는
		
		String k42_maxPlace = "";
		String k42_minPlace = "";
		String k42_maxAdd = "";
		String k42_minAdd = "";
		
		
		while ((k42_readtxt = br.readLine()) != null) {

			// 탭으로 분리해서 쪼갠 내용을 field 배열에 넣어준다.
			String[] k42_field = k42_readtxt.split(",");
			// 0번째항목부터 시작한다.
			System.out.printf("**[%d번째 항목]**************\n", k42_LineCnt);
			// field_name 탭으로 분리된 내용과 field 배열 10번째를 출력한다. //지번주소
			System.out.printf(" %s : %s\n", k42_field_name[1], k42_field[1]);
			System.out.printf(" %s : %s\n", k42_field_name[7], k42_field[7]); //도로명주소
			// field_name 탭으로 분리된 내용 field 배열 13번째를 출력한다. //위도를 출력하는 것
			System.out.printf(" %s : %s\n", k42_field_name[3], k42_field[3]);
			// field_name 탭으로 분리된 내용 field 배열 14번째를 출력한다. //경도를 출력하는 것
			System.out.printf(" %s : %s\n", k42_field_name[2], k42_field[2]);
			// 거리를 double 실수형으로 저장한다. pow는 제곱근을 반환하는 함수이다.
			// Double.parseDouble String 타입의 문자열을 double로 (실수) 바꿔주는 메소드이다.
			// 피타고라스 정의를 통해 dist를 구한다.

			double dist = Math.sqrt(
					Math.pow(Double.parseDouble(k42_field[3]) - k42_lat, 2) + Math.pow(Double.parseDouble(k42_field[2]) - k42_lng, 2));

			System.out.printf(" 현재지점과 거리 : %fkm \n", dist * 100);
			System.out.printf("************************\n");
			if (k42_LineCnt == 1) {
				k42_max = dist;
				k42_min = dist;
				k42_maxNum = k42_LineCnt;
				k42_minNum = k42_LineCnt;

			} else {
				if (dist > k42_max) {
					k42_max = dist;
					k42_maxNum = k42_LineCnt;
					k42_maxPlace = k42_field[1];
					k42_maxAdd = k42_field[7];
					
					
				}
				if (dist < k42_min) {
					k42_min = dist;
					k42_minNum = k42_LineCnt;
					k42_minPlace = k42_field[1];
					k42_minAdd = k42_field[7];

				}
			}
			k42_LineCnt++;
		}

		br.close();
		System.out.printf("도로명주소 %s\n 장소 : %s\n 최대거리 : %skm\n", k42_maxAdd, k42_maxPlace, k42_max * 100);
		
		System.out.printf("도로명주소 : %s\n 장소 : %s\n 최소거리 : %skm\n", k42_minAdd, k42_minPlace, k42_min * 100);
	}
}





