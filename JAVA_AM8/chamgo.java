package package_kopo26_10th;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment10_1_11 extends Thread{

   public static void main(String[] args) throws InterruptedException {
      Assignment10_1_11 thread = new Assignment10_1_11();
      thread.start();
      Date now = CurrentTime();
      printTime(now);
      afterSec(now);
   }
   
   public static void printTime(Date date) {
      SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
      String time = format.format(date);
      System.out.println(time);
   }
   
   public static Date CurrentTime() {
      SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
      Date date = new Date();
      return date;
   }
   
   public static void afterSec(Date now) {
      Scanner sc = new Scanner(System.in);
      while (true) {
         long sec = sc.nextInt() * 1000;
         
         Date later = CurrentTime();      // 내가 시간을 입력하기 직전까지의 현재시간
         if (later.getTime() > now.getTime() + sec) {
            try {
               Thread.sleep(sec);
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            System.out.print("Time is already over. It's ");
            Date la = CurrentTime();
            printTime(la);
         } else {
            
            try {
               Thread.sleep(now.getTime() + sec - later.getTime());
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
            now.setTime(now.getTime() + sec);
            System.out.print("It's over ");
            printTime(now);
         }
      }
   }
}