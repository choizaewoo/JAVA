package JAVA8;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JAVA8 {

   public static JSONObject k26_oneRec(String k26_name, int k26_studentid, int k26_kor, int k26_eng, int k26_mat) {
      JSONObject k26_dataObject = new JSONObject();
      k26_dataObject.put("name",  k26_name);
      k26_dataObject.put("studentid",  k26_studentid);
      
      JSONArray k26_score = new JSONArray();
      k26_score.add(k26_kor); k26_score.add(k26_eng); k26_score.add(k26_mat);
      k26_dataObject.put("score", k26_score);
      
      return k26_dataObject;
   }
   
   public static void main(String[] args) {
      JSONObject k26_jSONObject = new JSONObject();
      JSONArray k26_dataArray = new JSONArray();
      
      JSONObject k26_dataObject = new JSONObject();
      k26_dataObject.put("name", "나연");
      k26_dataObject.put("studentid", 209901);
      
      JSONArray k26_score = new JSONArray();
      k26_score.add(90); k26_score.add(100); k26_score.add(95);
      k26_dataObject.put("score", k26_score);
      k26_dataArray.add(k26_dataObject);
      
      k26_dataArray.add(k26_oneRec("정연", 209902, 100,85,75));
      k26_dataArray.add(k26_oneRec("모모", 209903, 90,75,85));
      k26_dataArray.add(k26_oneRec("사나", 209904, 90,85,75));
      k26_dataArray.add(k26_oneRec("지효", 209905, 80,75,85));
      k26_dataArray.add(k26_oneRec("미나", 209906, 90,85,55));
      k26_dataArray.add(k26_oneRec("다연", 209907, 70,75,65));
      k26_dataArray.add(k26_oneRec("채영", 209908, 100,75,95));
      k26_dataArray.add(k26_oneRec("쯔위", 209909, 80,65,95));
      
      try {
         FileWriter k26_file = new FileWriter("C:\\Users\\kopo\\Desktop\\json.json");
         k26_file.write(k26_dataArray.toJSONString());
         k26_file.flush();
         k26_file.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
      System.out.println("JSON 만든거 : " + k26_dataArray);
   }

}