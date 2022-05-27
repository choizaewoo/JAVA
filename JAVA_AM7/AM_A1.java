package JAVA_AM_20220406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AM_A1 {

	public static void main(String[] args) {
		  List<Integer> arr = new ArrayList<Integer>();
	        Scanner scan = new Scanner(System.in);
	        int sum = 0;
	        int cnt1 = 0;
	        int cnt2 = 1;
	        int breakNum = scan.nextInt();

	        for (int i = 0; i < 2; i++) {
	            arr.add(i);
	        }

	        while (true) {
	            sum = 0;
	            sum = arr.get(cnt1++)+arr.get(cnt2++);

	            if(sum > breakNum) {
	                break;
	            }

	            arr.add(sum);
	        }
	        System.out.println(arr.toString());
	    }
		
	}
	
//		  Scanner sc = new Scanner(System.in);
//          System.out.print("정수 입력 : ");
//          int fiBo=sc.nextInt();
//          
//          int num1 = 0;
//          int num2 = 1;
//          int sum = 0;
//          
//          for(int i=0; i<fiBo; i++)
//          {
//              System.out.print(sum+" ");
//              sum=num1+num2; 
//              num1=num2;
//              num2=sum;
//          }
//
//     }
//}

