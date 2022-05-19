package JAVA;

public class JAVA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum; // c는 맨 앞에서만 선언해야 하지만, c++,java는 필요할 때 선언해도 됨. 
		
		sum = 0; //누적, 루프는 꼭 초기화
		
		//1부터 100까지 더해보자.
		for (int k42_i =1; k42_i < 101; k42_i++) {
			sum = sum + k42_i;
		}
		System.out.println("#2 : " + sum);
		// 평균을 처리한다면 여기서 다 더한 다음 한다.
		// 평균을 구한다. 100개를 더했으니 나눈다.
		System.out.println("#2-2 : " + sum/100); //sum으로 출력된 값을 100으로 나눈다.
		
		//배열을 이용한다. int 배열에 v값으로 1,2,3,4,5를 차례대로 넣어준다
		int [] v = {1,2,3,4,5};
		//초
		int vSum; //합을 정수로 받아들인다.
		
		vSum = 0; //sum은 항상 초기화를 시켜준다
		
		for (int k42_i = 0; k42_i < 5; k42_i++) { //i를 0부터 5까지 돌린다
			vSum= vSum + v[k42_i]; //i를 1부터 sum값과 더해주고 4까지 더해준다.
		}
		
		System.out.println("#2-3 : " + vSum);//vSum값을 출력해준다.
		
	
	}	
}
