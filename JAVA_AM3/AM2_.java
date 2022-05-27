package JAVA_AM_20220331;

import java.util.Scanner;

public class AM2_ {

	   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.print("-> ");
		      meanMedian(10);

		   }

		   public static int meanMedian(int Num) {
		      Scanner scan = new Scanner(System.in);
		      int num = scan.nextInt();
		      double mean = 0;
		      double Median = 0;
		      double sum = 0;
		      for (int i = num; i > 0; i--) {
		         System.out.println(i);
		      }
		      for (int j = 1; j <= num; j++) {
		         sum += j;
		         mean = (sum / j);
		      }

		      Median =( ((double) (num / 2)) + ((double) num / 2 + 1)) / 2;

		      System.out.print("Mean : " + mean + ", Median : " + Median);
		      return num;
		   }
		}
