package JAVA2;

public class JAVA4 {

	public static void main(String[] args) {
		
		int k42_il; //정수형 변수 il
		double k42_iD; //실수형 변수 iD
		
		k42_il = 10/3; // 3.333333이 아니다. 정수형이기 때문.
		k42_iD = 10/3.0; //3.333333이다. 실수형이기 때문.
		
		if (k42_il == k42_iD) { //만약 il이 iD와 같다면~ (같지 않겠지.)
			System.out.println("equal"); //equal 출력.			
		} else {  // 같지 않다면!
			System.out.printf("Not equal[%f][%f]\n", (double)k42_il,k42_iD); //il을 실수형 double로 형변환을 시켜주고 출력하고, double형 iD를 출력한다.
		}
		
		if (k42_iD == 3.333333) { // 단지 유효숫자까지 표시만 된 거라 엄연히 다르다.
			System.out.println("equal"); //equal 출력.
		}else {//그렇지않으면 
			System.out.printf("Not equal[3.333333][%f]\n", k42_iD); //iD를 출력한다. 
		}
		//바궈치기
		k42_iD = (int)k42_iD; //int형으로 형변환한 iD변수가 double형 iD변수로 저장.
		if (k42_il == k42_iD) { //만약 둘이 같으면 
			System.out.printf("equal\n"); //equal!!
		}else { //그렇지 안흥면!!
			System.out.printf("Not equal[%f][%f]\n", (double)k42_il,k42_iD); //정수형 변수il를 실수형으로 형변환을 해서 출력. 그리고 iD는 정수형으로 출력. 
		}
		
		System.out.printf("int로 인쇄[%d][%f]\n", k42_il, k42_iD);//정수형 변수 il을 출력한다. 3이 출력됨. 그리고 iD변수는 정수형으로 형변환을 시켜주었기 때문에. float으로 받았으니 3.000000이 출력된다.
		System.out.printf("double로 인쇄[%f][%f]\n", (double)k42_il, k42_iD); //정수형변수 il을 double 실수형으로 형변환해서 출력한다. 실수형변수iD는 float으로 받아서 출력.
		
		char k42_a = 'c'; // 문자형 char의 변수로 a를 선언. 'c'를 받아준다.
		
		if (k42_a=='b') { //만약 변수a가 b라면 
			System.out.println("a는 b이다"); //a는 b겠지
		}
		if (k42_a=='c') { //만약 변수a가 c라면 
			System.out.println("a는 c이다."); //c겄지.
		}
		if (k42_a=='d') { //먄약 변수a가 d라면 
			System.out.println("a는 d이다."); //d지 않겄나.
		}
		
		
		}
	}

