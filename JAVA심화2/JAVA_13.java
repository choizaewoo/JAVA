package JAVA2;

public class JAVA_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fSin; //실수형 변수를 fSin로 선언한다.
		
		for (int i = 0; i < 360; i++) { // for문 i를 0부터 359까지 1씩 증가시키면서 반복시킬 것이다.
			
			fSin =Math.sin(i * 3.141592/180); //실수형 변수fSin에 sin값을 저장해준다. 
			System.out.printf("%d sin ==> %f\n",i,fSin); // i와 fsin 값을 출력해준다.
		}
		
		for (int i =0; i < 360; i++) { // i를 0부터 359까지 반복한다.
			fSin = Math.sin(i* 3.141592/180); // 값을 fsin에 저장한다.
			
			int iSpace = (int)((1.0-fSin) * 50); //정수형으로 변경해서 ispace만큼 띄운다는 뜻.
			for (int j = 0; j < iSpace; j++) System.out.printf(" ");
			System.out.printf("*[%f][%d]\n",fSin,iSpace);
			
		}
	}

}
