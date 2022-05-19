package JAVA_AM_20220331;

import java.util.Scanner;

public class AM_A4 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	        for (int i=0; i<n; i++) {
	            System.out.print(fibo(i)+" ");
	        }
	    }

	    public static int fibo(int n) {
	        // 전달받은 값과 동일한 값을 리턴한다면 계산할 필요가 없으므로 중단
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibo(n-2) + fibo(n-1);
	        }
	    }
	}
