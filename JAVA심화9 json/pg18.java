package javajump9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class pg18 {
	
	public static void main(String[] args) {
		// Json�����
		// JSONObject ���� �������� �ϼ��� ����
		JSONObject k42_jsonObject = new JSONObject();
		// JSONArray ����, �Ѹ��� ���� ������ ���� array
		JSONArray k42_datasArray = new JSONArray();
		// JSONObject �Ѹ� ������ �� �����̴�.
		JSONObject k42_dataObject = new JSONObject();
		// �̸�, ���� / �й�, 209901 �� �ִ´�.
		k42_dataObject.put("name", "����");
		k42_dataObject.put("studentid", "209901");
		//JSONArray ����
		JSONArray k42_score = new JSONArray();
		// ������ ��̿� ������ �Է��Ѵ�. ������ ����
		k42_score.add(90); k42_score.add(100); k42_score.add(95); 
		k42_dataObject.put("score", k42_score);
		k42_datasArray.add(k42_dataObject);
		
		// �Ʒ��� ������ �޼ҵ�� 8���� ������ �Է��Ѵ�.
		k42_datasArray.add(k42_oneRec("����", 209902, 100, 85, 75));
		k42_datasArray.add(k42_oneRec("���", 209903, 100, 85, 75));
		k42_datasArray.add(k42_oneRec("�糪", 209904, 100, 100, 100));
		k42_datasArray.add(k42_oneRec("��ȿ", 209905, 100, 85, 75));
		k42_datasArray.add(k42_oneRec("�̳�", 209906, 90, 85, 70));
		k42_datasArray.add(k42_oneRec("����", 209907, 90, 85, 75));
		k42_datasArray.add(k42_oneRec("ä��", 209908, 100, 90, 75));
		k42_datasArray.add(k42_oneRec("����", 209909, 70, 85, 75));
		
		try {	// try catch ����
			// FileWriter ����, ������ ������ ��ġ�� ���ϸ� �ۼ�
			FileWriter k42_file = new FileWriter("C:\\Users\\kopo\\Desktop\\ch9\\test.json");
			// �Է¹��� ���̽� ��̸� ��Ʈ������ ��ȯ�Ѵ�.
			k42_file.write(k42_datasArray.toJSONString());
			k42_file.flush();	// �޸𸮸� ����̽��� �Űܶ�
			k42_file.close();	// filewriter ����
		} catch(IOException k42_e) {
			k42_e.printStackTrace();	// ������ �߻��ص� ����, �����޼��� ����
		}
		System.out.printf("JSON ����� : " + k42_datasArray);	// ���� ����� ���
	}
	// �̸�, �й�, ����, �� �Է��ϰ� JSONObject���·� ���Ϲ޴� �޼ҵ� ����
	public static JSONObject k42_oneRec (String name, int k42_studentid, int k42_kor, int k42_eng, int k42_mat) {
		// JSONObject �Ѹ� ������ �� �����̴�.
		JSONObject k42_dataObject = new JSONObject();
		// �̸��� �Է¹��� �̸��� �ִ´�.
		k42_dataObject.put("name", name);
		k42_dataObject.put("studentid", k42_studentid);	// �й��� �Է¹��� �й��� �ִ´�.
		
		JSONArray k42_score = new JSONArray();	// ���� ��̸� �����
		// ���� ���� ���� ������ �Է��Ͽ� ������ ���� ���� ��̿� �ִ´�.
		k42_score.add(k42_kor); k42_score.add(k42_eng); k42_score.add(k42_mat);
		// ������ ��� �Է¹��� ��̸� �л� ��̿� �߰��Ѵ�
		k42_dataObject.put("score", k42_score);
		// �ϼ��� ��̸� �����Ѵ�.
		return k42_dataObject;
	}

}
