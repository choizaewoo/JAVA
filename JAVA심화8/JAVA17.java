package JAVA8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JAVA17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\kopo\\day_data\\A0053902015.csv"); 
	      BufferedReader br = new BufferedReader (new FileReader(f));   
	      
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
	      System.out.printf("시작 :%s\n", sdt.format(c1.getTime()));
	      
	      StringBuffer a = new StringBuffer(); 
	      String name = "기준, 날짜, 종목, 시가, 종가, 고가, 저가"; 
	      a.append(name); 
	      br.write(a.toString()); br.newLine(); 
	      
	      
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
	}

}
