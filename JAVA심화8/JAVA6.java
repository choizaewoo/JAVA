package JAVA8;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JAVA6 {

   public static JSONObject k26_oneRec(String k42_name, int k42_studentid, int k26_kor, int k26_eng, int k42_mat) {
      
	  JSONObject k42_dataObject = new JSONObject();
      k42_dataObject.put("name",  k42_name);
      k42_dataObject.put("studentid",  k42_studentid);
      
      JSONArray k42_score = new JSONArray();
      k42_score.add(k26_kor); k42_score.add(k26_eng); k42_score.add(k42_mat);
      k42_dataObject.put("score", k42_score);
      
      return k42_dataObject;
   }
   
   public static void main(String[] args) {
      JSONObject k42_jSONObject = new JSONObject();
      JSONArray k42_dataArray = new JSONArray();
      
      JSONObject k42_dataObject = new JSONObject();
      k42_dataObject.put("name", "����");
      k42_dataObject.put("studentid", 209901);
      
      JSONArray k26_score = new JSONArray();
      k26_score.add(90); k26_score.add(100); k26_score.add(95);
      k42_dataObject.put("score", k26_score);
      k42_dataArray.add(k42_dataObject);
      
      k42_dataArray.add(k26_oneRec("����", 209902, 100,85,75));
      k42_dataArray.add(k26_oneRec("���", 209903, 90,75,85));
      k42_dataArray.add(k26_oneRec("�糪", 209904, 90,85,75));
      k42_dataArray.add(k26_oneRec("��ȿ", 209905, 80,75,85));
      k42_dataArray.add(k26_oneRec("�̳�", 209906, 90,85,55));
      k42_dataArray.add(k26_oneRec("�ٿ�", 209907, 70,75,65));
      k42_dataArray.add(k26_oneRec("ä��", 209908, 100,75,95));
      k42_dataArray.add(k26_oneRec("����", 209909, 80,65,95));
      
      try {
         FileWriter k42_file = new FileWriter("C:\\Users\\kopo\\Desktop\\test.json");
         k42_file.write(k42_dataArray.toJSONString());
         k42_file.flush();
         k42_file.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
      System.out.println("JSON ����� : " + k42_dataArray);
   }

}