//package JAVA8; //�Ｚ����
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
//				//����ð��� �ҷ��´�. ������� �������� ��µǴ��� �ð��� ��Ȯ�ϰ� ǥ���ϱ� ���ؼ�
//				SimpleDateFormat sdt = new SimpleDateFormat(" HH:mm:ss");
//				//�ð�Ŭ������� getInstatnce() �ý������� �ҷ�����.
//			      Calendar c1 = Calendar.getInstance();
//
//
//				//�ֽĵ����͸� �б� ���� bufferReader ��ü�� ���� fileReader�� ������ �Ǵ� ������ �ҷ��´�.
//				File f = new File("C:\\Users\\kopo\\day_data\\StockDailyPrice.csv"); 
//				BufferedReader br = new BufferedReader(new FileReader(f));
//				//�ֽĵ����͸� ���� ���� bufferReader ��ü�� ���� fileReader�� ������ �Ǵ� ������ �ҷ��´�
//				File f1 = new File("C:\\Users\\kopo\\day_data\\A0053902015.csv");
//				BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
//				//�ҷ��� ���ڿ��� �����Ѵ�.
//				String a = "A005930";
//				String b = "2015";
//				String [] c; 
//				c =new String [1000];
//				String readtxt;
//
//					
//				
//				//���ڿ��� readtxt�� �����Ѵ�.
//				
//				int cnt = 0; 
//				int wcnt = 0;
//								
//				
//		        System.out.printf("���α׷� ���� :%s\n", sdt.format(c1.getTime()));
//		              
//		        			
//				//�ݺ����� �̿��ؼ�
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
//			        System.out.printf("���α׷� ���� : %s ���� �� : %d ����� ���� �� : %d \n", sdt2.format(c2.getTime()), cnt, wcnt);
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
