package JAVA_AM_20220405;

import java.util.Scanner;

public class AM_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; // 입력 받을 숫자 갯수
		// double type 배열에 공간 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 숫자의 개수를 입력하세요.");
		//int type으로 개수 입력하기
		count = sc.nextInt();
		//입력한 갯수 (길이)  만큼 배열을 생성해서 변수이름에 저장 
		// 입력 받을 숫자; //소수점으로 나타내기 위해 double type 사용 
		double[] Arr = new double[count];
		//double [] Arr;
		//Arr = new double[count];

		System.out.println(count + "개의 숫자를 입력하세요.(소수점도 가능)");
		
		//Arr[i]를 출력
		for (int i = 0; i < count; i++) {
			//입력한 개수까지 i를 돌린다 (10개를 넣었다면 10까지 돌아감)
			//Arr[0],Arr[1],Arr[2],Arr[3],Arr[4]..
			//nextDouble 메소드로 Arr[i]에 저장. //nextInt 메소드로는 정수외에 받지 못함.
			Arr[i] = sc.nextDouble();
		}
		
		
		//Arr의 크기만큼 i를 돌린다.
		for (int i = 0; i < Arr.length; i++) {
			//Arr의 크기만큼 j를 돌린다.  
			for (int j = i + 1; j < Arr.length; j++) {
				//Arr[i]의 값과 Arr[j]의 값이 같으면 중복된 숫자를 출력.
				if (Arr[i] == Arr[j]) {
					System.out.println("Duplicated number is :" + Arr[i]);
				}
			}
		}
	}
}
