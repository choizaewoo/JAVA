package JAVA_20220405;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr = {100,95,80,70,60};
		
//		//for문을 이용한 배열의 출력
//		for(int i = 0; i < Arr.length; i++) {
//			System.out.printf("Arr[%d] : %d\n", i , Arr[i]);
//		}//Arr[0] : 100
//		Arr[1] : 95
//		Arr[2] : 80
//		Arr[3] : 70
//		Arr[4] : 60
//
//		
//	}
//}
		
		//Arrays.toString(배열이름) 메서드를 이용한 배열의 출력
		
		System.out.println(Arrays.toString(Arr));
		//[100, 95, 80, 70, 60]

	}

}
	