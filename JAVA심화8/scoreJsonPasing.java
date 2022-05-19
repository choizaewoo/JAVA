package JAVA8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class scoreJsonPasing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		JSONParser k42_paser = new JSONParser();
		// JSONParser 선언
		Object k42_obj = k42_paser.parse(new FileReader("C:\\Users\\kopo\\folder\\json.json"));
		// 읽어올 제이슨 파일의 경로와 이름 지정.
		JSONArray k41_array = (JSONArray)k42_obj;
		// JSONArray 선언
		System.out.println("**********************************************");
		//학생 수만큼 도는 for문 작성
		for(int k42_i = 0; k42_i < k41_array.size(); k42_i++) {
			//i번째 학생 데이터를 가져와서 k41_result에 넣는다.
			JSONObject k41_result = (JSONObject) k41_array.get(k42_i);
			System.out.println("이름 : " + k41_result.get("k41_name"));
			System.out.println("학번 : " + k41_result.get("k41_studentid"));
			
			JSONArray k41_score = (JSONArray) k41_result.get("k41_score");
			//k41_score로 과목별 점수를 가져온다.
			long k42_kor = (long)k41_score.get(0);
			long k42_eng = (long)k41_score.get(1);
			long k42_mat = (long)k41_score.get(2);
			
			System.out.println("국어 : " + k42_kor);
			System.out.println("영어 : " + k42_eng);
			System.out.println("수학 : " + k42_mat);
			System.out.println("총점 : " + (k42_kor + k42_eng + k42_mat));
			
			System.out.printf("평균 : %.0f\n" , (k42_kor + k42_eng + k42_mat)/3.0);
			System.out.println("**********************************************");
			
		}
	}

}