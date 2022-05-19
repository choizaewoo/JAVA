package JAVA;

public class JAVA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_val = 14/5; // 이 값은 2.8이다. int이기 때문에 소수점 이하를 버리면 2이다. 
		//반올림하면 3이다
		System.out.printf("#5-1 : %d\n", k42_val);
		
		double k42_valF; //소수점을 출력해주는 double 실수형이 나온다.
		//정수형 형변환을 하면 반올림처리가 된다.
		//실수가 뭔지 모르면집에 가던가..
		
		k42_valF = 14/5; // 14 와 5 즉 정수를 나누기 때문에 이건 소수점 자리가 출력이 안된다.
		System.out.printf("#5-2 : %f\n", k42_valF); //2.000000
		
		k42_valF = 14.0/5; // 한개라도 실수형태의 표시를 해주어야 double형이 나온다.
		System.out.printf("#5-3 : %f\n", k42_valF); //2.800000
		
		k42_valF = (14.0)/5 + 0.5; //실수형에 0.5를 더해보자. 
		System.out.printf("#5-4 : %f\n", k42_valF); //3.300000
		
		k42_val = (int)((14.0)/5 + 0.5); //실수형계산을 하고 정수형으로 형 변환을 한다.
		System.out.printf("#5-5 : %d\n", k42_val); // 3
	}

}
