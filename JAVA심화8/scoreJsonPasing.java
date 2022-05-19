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
		// JSONParser ����
		Object k42_obj = k42_paser.parse(new FileReader("C:\\Users\\kopo\\folder\\json.json"));
		// �о�� ���̽� ������ ��ο� �̸� ����.
		JSONArray k41_array = (JSONArray)k42_obj;
		// JSONArray ����
		System.out.println("**********************************************");
		//�л� ����ŭ ���� for�� �ۼ�
		for(int k42_i = 0; k42_i < k41_array.size(); k42_i++) {
			//i��° �л� �����͸� �����ͼ� k41_result�� �ִ´�.
			JSONObject k41_result = (JSONObject) k41_array.get(k42_i);
			System.out.println("�̸� : " + k41_result.get("k41_name"));
			System.out.println("�й� : " + k41_result.get("k41_studentid"));
			
			JSONArray k41_score = (JSONArray) k41_result.get("k41_score");
			//k41_score�� ���� ������ �����´�.
			long k42_kor = (long)k41_score.get(0);
			long k42_eng = (long)k41_score.get(1);
			long k42_mat = (long)k41_score.get(2);
			
			System.out.println("���� : " + k42_kor);
			System.out.println("���� : " + k42_eng);
			System.out.println("���� : " + k42_mat);
			System.out.println("���� : " + (k42_kor + k42_eng + k42_mat));
			
			System.out.printf("��� : %.0f\n" , (k42_kor + k42_eng + k42_mat)/3.0);
			System.out.println("**********************************************");
			
		}
	}

}