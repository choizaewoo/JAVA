package JAVA6;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputData3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
      Calendar c1 = Calendar.getInstance();

      int iPerson = 200; //총 인원
      int dividePerson = 30; // 페이지에 들어갈 인간들
      int lastPerson = iPerson % dividePerson; // 마지막 남은 인원들 
      int page = iPerson / dividePerson; //페이지 수 
      int totalNum = page * dividePerson; //전체 몇명?
      
      InputData inData = new InputData(iPerson);
      
      for (int i = 0; i < iPerson; i++) {
         String name = String.format("홍길%02d", i + 1);
         int kor = (int) (Math.random() * 100);
         int eng = (int) (Math.random() * 100);
         int mat = (int) (Math.random() * 100);
         inData.setData(i, name, kor, eng, mat);
      }
      
      for (int i = 0; i < iPerson; i++) {
         if (i != 0 && i % dividePerson == 0) {
            if (i <= 30) {
               System.out.printf("");
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "현재페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum() , inData.engSum(), inData.matSum(),
                     inData.totalSum(), inData.totalAvg());   
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg(), inData.engAvg(), inData.matAvg(),
                     inData.avgSum(), inData.avgAvg());            
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "누적페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum(), inData.engSum(), inData.matSum(),
                     inData.totalSum(), inData.totalAvg());   
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg(), inData.engAvg(), inData.matAvg(),
                     inData.avgSum(), inData.avgAvg());
            } else if (i > 30 && i <= 60) {
               System.out.printf("");
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "현재페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum1(), inData.engSum1(), inData.matSum1(),
                     inData.totalSum1(), inData.totalAvg1());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg1(), inData.engAvg1(), inData.matAvg1(),
                     inData.avgSum1(), inData.avgAvg1());
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "누적페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum1() + inData.korSum() , inData.engSum1() +  inData.engSum(), inData.matSum1() + inData.matSum() ,
                       inData.totalSum1() + inData.totalSum() , inData.totalAvg1() + inData.totalAvg());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", 
            		   inData.korAvg1()+inData.korAvg(), 
            		   inData.engAvg1()+inData.engAvg(), 
            		   inData.matAvg1()+inData.matAvg(),
                       inData.avgSum1()+ inData.avgSum(), 
                       inData.avgAvg1()+inData.avgAvg());
               System.out.printf("=======================================================================\n");
               System.out.println();
            } else if (i > 60 && i <= 90) {
               System.out.printf("");
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "현재페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum2(), inData.engSum2(), inData.matSum2(),
                     inData.totalSum2(), inData.totalAvg2());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg2(), inData.engAvg2(), inData.matAvg2(),
                     inData.avgSum2(), inData.avgAvg2());;
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "누적페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", 
            		   inData.korSum2()+ inData.korSum1() + inData.korSum(),
            		   inData.engSum2() + inData.engSum1() +  inData.engSum(),
            		   inData.matSum2() + inData.matSum1() + inData.matSum() ,
                       inData.totalSum2() + inData.totalSum1() + inData.totalSum(),
                       inData.totalAvg2() +  inData.avgAvg1()+inData.avgAvg());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", 
            		   inData.korAvg2() + inData.korAvg1()+inData.korAvg(), 
            		   inData.engAvg2() + inData.engAvg1()+inData.engAvg(), 
            		   inData.matAvg2() + inData.matAvg1()+inData.matAvg(),
                       inData.avgSum2() + inData.avgSum1()+ inData.avgSum(),
                       inData.avgAvg2() + inData.avgAvg1()+inData.avgAvg());
               System.out.printf("=======================================================================\n");
               System.out.println();
            } else if (i > 90 && i <= 120) {
               System.out.printf("");
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "현재페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum3(), inData.engSum3(), inData.matSum3(),
                       inData.totalSum3(), inData.totalAvg3());
                 System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg3(), inData.engAvg3(), inData.matAvg3(),
                       inData.avgSum3(), inData.avgAvg3());
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "누적페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", 
            		   inData.korSum3() + inData.korSum2()+ inData.korSum1() + inData.korSum(),
            		   inData.engSum3() +  inData.engSum2() + inData.engSum1() +  inData.engSum(),
            		   inData.matSum3() +  inData.matSum2() + inData.matSum1() + inData.matSum() ,
                       inData.totalSum3() + inData.totalSum2() + inData.totalSum1() + inData.totalSum(),
                       inData.totalAvg3() + inData.totalAvg2() +  inData.avgAvg1()+inData.avgAvg());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", 
            		   inData.korAvg3() +  inData.korAvg2() + inData.korAvg1()+inData.korAvg(), 
            		   inData.engAvg3() + inData.engAvg2() + inData.engAvg1()+inData.engAvg(),
            		   inData.matAvg3() + inData.matAvg2() + inData.matAvg1()+inData.matAvg(),
                       inData.avgSum3() + inData.avgSum2() + inData.avgSum1()+ inData.avgSum(),
                       inData.avgAvg3()+ inData.avgAvg2() + inData.avgAvg1()+inData.avgAvg());
               System.out.printf("=======================================================================\n");
               System.out.println();
            } else if (i > 120 && i <= 150) {
               System.out.printf("");
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "현재페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum4(), inData.engSum4(), inData.matSum4(),
                       inData.totalSum4(), inData.totalAvg4());
                 System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg4(), inData.engAvg4(), inData.matAvg4(),
                       inData.avgSum4(), inData.avgAvg4());;
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "누적페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", 
            		   inData.korSum4() + inData.korSum3() + inData.korSum2()+ inData.korSum1() + inData.korSum(), 
            		   inData.engSum4() +  inData.engSum3() +  inData.engSum2() + inData.engSum1() +  inData.engSum(), 
            		   inData.matSum4() +  inData.matSum3() +  inData.matSum2() + inData.matSum1() + inData.matSum() ,
                       inData.totalSum4() + inData.totalSum3() + inData.totalSum2() + inData.totalSum1() + inData.totalSum(),
                       inData.totalAvg4() + inData.totalAvg3() + inData.totalAvg2() +  inData.avgAvg1()+inData.avgAvg());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균",
            		   inData.korAvg4() +  inData.korAvg3() +  inData.korAvg2() + inData.korAvg1()+inData.korAvg(),
            		   inData.engAvg4() + inData.engAvg3() + inData.engAvg2() + inData.engAvg1()+inData.engAvg(),
            		   inData.matAvg4() +  inData.matAvg3() + inData.matAvg2() + inData.matAvg1()+inData.matAvg(),
                       inData.avgSum4() + inData.avgSum3() + inData.avgSum2() + inData.avgSum1()+ inData.avgSum(),
                       inData.avgAvg4() +  inData.avgAvg3()+ inData.avgAvg2() + inData.avgAvg1()+inData.avgAvg());
               System.out.printf("=======================================================================\n");
               System.out.println();

            } else if (i > 150 && i <= 180) {
               System.out.printf("");
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "현재페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum5(), inData.engSum5(), inData.matSum5(),
                       inData.totalSum5(), inData.totalAvg5());
                 System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg5(), inData.engAvg5(), inData.matAvg5(),
                       inData.avgSum5(), inData.avgAvg5());;
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "누적페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", 
            		   inData.korSum5() +  inData.korSum4() + inData.korSum3() + inData.korSum2()+ inData.korSum1() + inData.korSum(),
            		   inData.engSum5() + inData.engSum4() +  inData.engSum3() +  inData.engSum2() + inData.engSum1() +  inData.engSum(),  
            		   inData.matSum5() +  inData.matSum4() +  inData.matSum3() +  inData.matSum2() + inData.matSum1() + inData.matSum() ,
                       inData.totalSum5() +  inData.totalSum4() + inData.totalSum3() + inData.totalSum2() + inData.totalSum1() + inData.totalSum(),
                       inData.totalAvg5() + inData.totalAvg4() + inData.totalAvg3() + inData.totalAvg2() +  inData.avgAvg1()+inData.avgAvg());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", 
            		   inData.korAvg5() + inData.korAvg4() +  inData.korAvg3() +  inData.korAvg2() + inData.korAvg1()+inData.korAvg(),
            		   inData.engAvg5() + inData.engAvg4() + inData.engAvg3() + inData.engAvg2() + inData.engAvg1()+inData.engAvg(),
            		   inData.matAvg5() + inData.matAvg4() +  inData.matAvg3() + inData.matAvg2() + inData.matAvg1()+inData.matAvg(),
                       inData.avgSum5() +  inData.avgSum4() + inData.avgSum3() + inData.avgSum2() + inData.avgSum1()+ inData.avgSum(), 
                       inData.avgAvg5() +  inData.avgAvg4() +  inData.avgAvg3()+ inData.avgAvg2() + inData.avgAvg1()+inData.avgAvg());
               System.out.printf("=======================================================================\n");
               System.out.println();
               
            } 
            
            else if (lastPerson !=0) {
               System.out.printf("");
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "현재페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", inData.korSum6(), inData.engSum6(), inData.matSum6(),
                       inData.totalSum6(), inData.totalAvg6());
                 System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", inData.korAvg6(), inData.engAvg6(), inData.matAvg6(),
                       inData.avgSum6(), inData.avgAvg6());;
               System.out.printf("=======================================================================\n");
               System.out.printf("%s\n", "누적페이지");
               System.out.printf("%s%14d%7d%6d%7d%7d\n", "합계", 
            		   inData.korSum6() + inData.korSum5() +  inData.korSum4() + inData.korSum3() + inData.korSum2()+ inData.korSum1() + inData.korSum(),
            		   inData.engSum6() +  inData.engSum5() + inData.engSum4() +  inData.engSum3() +  inData.engSum2() + inData.engSum1() +  inData.engSum(),
            		   inData.matSum6() +  inData.matSum5() +  inData.matSum4() +  inData.matSum3() +  inData.matSum2() + inData.matSum1() + inData.matSum() ,
                       inData.totalSum6() + inData.totalSum5() +  inData.totalSum4() + inData.totalSum3() + inData.totalSum2() + inData.totalSum1() + inData.totalSum(),
                       inData.totalAvg6() + inData.totalAvg5() + inData.totalAvg4() + inData.totalAvg3() + inData.totalAvg2() +  inData.avgAvg1()+inData.avgAvg());
               System.out.printf("%s%13d%7d%6d%7d%7d\n", "평균", 
            		   inData.korAvg6() + inData.korAvg5() + inData.korAvg4() +  inData.korAvg3() +  inData.korAvg2() + inData.korAvg1()+inData.korAvg(),
            		   inData.engAvg6() + inData.engAvg5() + inData.engAvg4() + inData.engAvg3() + inData.engAvg2() + inData.engAvg1()+inData.engAvg() ,
            		   inData.matAvg6() + inData.matAvg5() + inData.matAvg4() +  inData.matAvg3() + inData.matAvg2() + inData.matAvg1()+inData.matAvg() ,
                       inData.avgSum6() + inData.avgSum5() +  inData.avgSum4() + inData.avgSum3() + inData.avgSum2() + inData.avgSum1()+ inData.avgSum(), 
                       inData.avgAvg6() + inData.avgAvg5() +  inData.avgAvg4() +  inData.avgAvg3()+ inData.avgAvg2() + inData.avgAvg1()+inData.avgAvg());
               System.out.printf("=======================================================================\n");
               System.out.println();
            }            
         }

            if (i % 30 == 0) {
               System.out.println();
               System.out.printf("%35s\n", "성적집계표");
               System.out.printf("%48s%s\n", "출력일자 : ", sdt.format(c1.getTime()));
               System.out.printf("=======================================================================\n");
               System.out.printf("%s%5s%5s%5s%4s%5s%6s", "번호", "이름", "국어", "영어", "수학", "총점", "평균\n");
               System.out.printf("=======================================================================\n");
            }

            System.out.printf("%3d%8s%4d%7d%6d%8d%6d\n", i + 1, inData.name[i], inData.kor[i], inData.eng[i],
                  inData.mat[i], inData.sum[i], inData.avg[i]);
         }
         
         System.out.printf("");
         System.out.printf("=======================================================================\n");
         System.out.printf("%s\n", "현재페이지");
         System.out.printf("%s\n", "합계");   
         System.out.printf("%s\n", "평균");
         System.out.printf("=======================================================================\n");
         System.out.printf("%s\n", "누적페이지");
         System.out.printf("%s\n", "합계");
         System.out.printf("%s\n", "평균");
         System.out.printf("=======================================================================\n");
         System.out.println();

         

      }
   }