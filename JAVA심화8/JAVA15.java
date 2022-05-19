package JAVA8; //거리계산

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA15 {

	public static void main(String[] args) throws IOException {
		//File객체를 통해 file을 불러온다.
		File f = new File("C:\\Users\\kopo\\folder\\무료와이파이정보서울.txt");
		//BufferedReader객체를 통해 fileReader객체의 데이터를 읽어온다.
		BufferedReader br = new BufferedReader(new FileReader(f));
		//문자열을 변수를 선언한다.
		String readtxt;
		String maxPt = ""; 
	    String minPt = ""; 
	    int max = 0; 
	    int min = 0;
	      
		//readtxt에 파일을 한줄씩 쪼갠 내용을 저장하고 그 값이 null일 때는
		if((readtxt = br.readLine()) == null) {
			//빈 파일이라고 출력한다.
			System.out.printf("빈 파일입니다.\n");
			//그 값을 반환한다
			return;
		}
		
		//readtxt파일의 내용을 탭으로 분리하여 배열 field_name에 저장한다.
		String [] field_name = readtxt.split("\t");
		//위도를 정해준다.
		double lat = 37.831352;
		//경도를 정해준다.
		double lng = 127.509737;
		//LineCnt 0으로 초기화 
		int LineCnt = 0;
		//한줄씩 읽어들인 내용을 readtxt에 저장하고 그 값이 nulld이 아닐 때는
		while((readtxt = br.readLine())!=null) {
			
			//탭으로 분리해서 쪼갠 내용을 field 배열에 넣어준다.
			String [] field = readtxt.split("\t");
			//0번째항목부터 시작한다.
			System.out.printf("**[%d번째 항목]**************\n", LineCnt);
			//field_name 탭으로 분리된 내용과 field 배열 10번째를 출력한다.  //지번주소
			System.out.printf(" %s : %s\n", field_name[9], field[9]);
			//field_name 탭으로 분리된 내용 field 배열 13번째를 출력한다. //위도를 출력하는 것
			System.out.printf(" %s : %s\n", field_name[13], field[13]);
			//field_name 탭으로 분리된 내용 field 배열 14번째를 출력한다. //경도를 출력하는 것
			System.out.printf(" %s : %s\n", field_name[14], field[14]);
			//거리를 double 실수형으로 저장한다. pow는 제곱근을 반환하는 함수이다. 
			//Double.parseDouble String 타입의 문자열을 double로 (실수) 바꿔주는 메소드이다.
			//피타고라스 정의를 통해 dist를 구한다.
			double dist = Math.sqrt(Math.pow(Double.parseDouble(field[13]) - lat, 2)
					+ Math.pow(Double.parseDouble(field[14]) - lng, 2));
			System.out.printf(" 현재지점과 거리 : %f \n", dist * 100);
			System.out.printf("************************\n");
		
			
			LineCnt++;
		}
		br.close();
		br.close();
		System.out.printf("최대거리 : %skm\n", max * 100);
		System.out.printf("최소거리 : %skm\n", min * 100 );	
	}

}
