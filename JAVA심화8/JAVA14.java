package JAVA8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JAVA14 {
   // A005930 (�Ｚ����) �� 2015�� ���� �������� �ִ� �ּ� ���ϱ�
   public static void main(String[] args) throws IOException{
      // TODO Auto-generated method stub
	 //����ð��� �ҷ��´�. ������� �������� ��µǴ��� �ð��� ��Ȯ�ϰ� ǥ���ϱ� ���ؼ�
		SimpleDateFormat sdt = new SimpleDateFormat(" HH:mm:ss");
		//�ð�Ŭ������� getInstatnce() �ý������� �ҷ�����.
	      Calendar c1 = Calendar.getInstance();
	   
	   File f = new File("C:\\Users\\kopo\\day_data\\A0053902015.csv"); 
      BufferedReader br = new BufferedReader (new FileReader(f));   
      
      File f1 = new File("C:\\Users\\kopo\\day_data\\A0053902015_MaxMin.csv");   
      BufferedWriter bw1 = new BufferedWriter (new FileWriter(f1)); 
      
      String SamSung = "A005930"; 
      String SamSungDate = "2015";
      String maxPt = ""; 
      String minPt = ""; 
      int max = 0; 
      int min = 0;
      
      String readtxt; 
      int wcnt = 1; 
      
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
      System.out.printf("���� :%s\n", sdt.format(c1.getTime()));
      
      StringBuffer a = new StringBuffer(); 
      String name = "����, ��¥, ����, �ð�, ����, ��, ����"; 
      a.append(name); 
      bw1.write(a.toString()); bw1.newLine(); 
      
      
      for (int i = 0; i < wcnt; i++) { 
         while ((readtxt = br.readLine()) != null) { 
            String[] nameDivide = readtxt.split(",");
            StringBuffer s = new StringBuffer(); 
            
            wcnt = 0; 
           
            if (nameDivide[1].contains(SamSungDate) && nameDivide[2].contains(SamSung)) { 
               s.append(readtxt); 
               bw1.write(s.toString());
               bw1.newLine(); 
              
               
               if (max == 0 && min == 0) {
                  max = Integer.valueOf(nameDivide[3]); 
                  min = Integer.valueOf(nameDivide[3]); 
               } else if (max < Integer.valueOf(nameDivide[3])) {
                  max = Integer.valueOf(nameDivide[3]); 
                  maxPt = nameDivide[1]; 
               } else if (min > Integer.valueOf(nameDivide[3])) {
                  min = Integer.valueOf(nameDivide[3]);
                  minPt = nameDivide[1]; 
               
               }
            }
         }
         wcnt++;

      }
      SimpleDateFormat sdt2 = new SimpleDateFormat("HH:mm:ss");
		Calendar c2 = Calendar.getInstance();
			br.close();
			bw1.close();
			System.out.printf("���� : %s\n", sdt2.format(c2.getTime()));
			System.out.printf("��¥ : %s �ְ� : %d\n", maxPt, max );
			System.out.printf("��¥ : %s ������ : %d", minPt, min );

   }

}

//int [] a = {1,4,6,9,10,3};
//int iMax = -1;
//int iMaxPt = 0;
//for (int i = 0; i < a.length; i++) {
//   if (a[i] > iMax) {
//      iMax = a[i];
//      iMaxPt = i; 
//   }
//   }
