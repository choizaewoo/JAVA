package JAVA_AM_20220330;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 double avr = 0, max =0, min=0, sum=0, num= 7;
//	      
//	      double[] savePoint = {3,8,29,12,46,7,11};
//	      
//	      max = savePoint[0];
//	      min = savePoint[0];
//	      sum = savePoint[0];
//	      
//	      for (int i = 1; i < num; i++) {
//	         
//	         if (savePoint[i] > max) {
//	            max = savePoint[i];
//	         }else if (savePoint[i] < min) {
//	            min = savePoint[i];
//	         }
//	         sum += savePoint[i];
//	         avr = sum / num;
//	      }
//	      System.out.println(max + " " + min + " " + sum + " " + avr);
//	   }
//
//	}
		int[] number;
		number = new int[100];
		Scanner sc = new Scanner(System.in);
		int max = number[0];
		int min = number[0];
		int avg = number[0];
		int sum = number[0];
		System.out.println("숫자를 입력해주세요.");
		int num = 0;
		num = sc.nextInt();
	
			for (int i = 0; i < number.length; i++) {
				number[i] = num;

				if (number[i] > max) {
					max = number[i];
					
			}
			
		}
			System.out.println("Maximum :" + max);
			
	}
}




