package JAVA8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JAVA7 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser k42_parser = new JSONParser();
	
		Object k42_obj = k42_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\json.json"));
		
		JSONArray array = (JSONArray)k42_obj;
		
		System.out.println("*********************************************");
		for (int k42_i = 0; k42_i < array.size(); k42_i++) {
			JSONObject k42_result = (JSONObject) array.get(k42_i);
			System.out.println("이름 : " + k42_result.get("name"));
			System.out.println("학번 : " + k42_result.get("studentid"));
			
					
			JSONArray k42_score = (JSONArray) k42_result.get("score");
			long k42_kor = (long)k42_score.get(0); //배열 첫번째를 형변환시켜 변수 kor에 저장한다.
			long k42_eng = (long)k42_score.get(1);
			long k42_mat = (long)k42_score.get(2);
			System.out.println("국어 :" + k42_kor);
			System.out.println("영어 :" + k42_eng);
			System.out.println("수학 :" + k42_mat);
			System.out.println("총점 :" + (k42_kor + k42_eng + k42_mat));
			System.out.println("평균 :" + ((k42_kor+k42_eng+k42_mat)/3.0));
			System.out.println("**************************************");

		}
	}
}
