//package JAVA8; //삼성전자
//
//		import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//		public class JAVA13 {
//
//			public static void main(String[] args) throws IOException {
//				//현재시간을 불러온다. 현재부터 언제까지 출력되는지 시간을 명확하게 표현하기 위해서
//				SimpleDateFormat sdt = new SimpleDateFormat(" HH:mm:ss");
//				//시간클래스사용 getInstatnce() 시스템정보 불러오기.
//			      Calendar c1 = Calendar.getInstance();
//
//
//				//주식데이터를 읽기 위해 bufferReader 객체를 통해 fileReader의 데이터 또는 정보를 불러온다.
//				File f = new File("C:\\Users\\kopo\\day_data\\StockDailyPrice.csv"); 
//				BufferedReader br = new BufferedReader(new FileReader(f));
//				//주식데이터를 쓰기 위해 bufferReader 객체를 통해 fileReader의 데이터 또는 정보를 불러온다
//				File f1 = new File("C:\\Users\\kopo\\day_data\\A0053902015.csv");
//				BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
//				//불러올 문자열을 선언한다.
//				String a = "A005930";
//				String b = "2015";
//				String [] c; 
//				c =new String [1000];
//				String readtxt;
//
//					
//				
//				//문자열을 readtxt로 선언한다.
//				
//				int cnt = 0; 
//				int wcnt = 0;
//								
//				
//		        System.out.printf("프로그램 시작 :%s\n", sdt.format(c1.getTime()));
//		              
//		        			
//				//반복문을 이용해서
//				while((readtxt = br.readLine())!=null) {
//				StringBuffer s = new StringBuffer();
//
//					for(int i = 0; i < c.length; i++) {					
//							if([c[i] > )
//						
//					}
//				
//					if(readtxt.contains(a)) {
//						if(readtxt.contains(b)){
//						s.append(readtxt);	
//						bw1.write(s.toString()); bw1.newLine();
//						wcnt++;		
//					}
//					cnt++;
//				}
//				}
//					SimpleDateFormat sdt2 = new SimpleDateFormat("HH:mm:ss");
//					Calendar c2 = Calendar.getInstance();
//			        System.out.printf("프로그램 종료 : %s 읽은 수 : %d 저장된 파일 수 : %d \n", sdt2.format(c2.getTime()), cnt, wcnt);
//			        br.close();
//					bw1.close();
//				}
//		}
//		
//	
//					
////	int [] a = {1,4,6,9,10,3};
////		int iMax = -1;
////		int iMaxPt = 0;
////		for (int i = 0; i < a.length; i++) {
////		   if (a[i] > iMax) {
////		      iMax = a[i];
////		      iMaxPt = i; 
////		   }
////		   }
