package JAVA2;

public class JAVA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5; i++) { //이 안에서 int 선언해주는 것이 좋음. 밖에서 선언할경우 에러날수도 있다. {}블록범위를 잘 파악해라.
			//i를 1부터 5까지 돌린다.	
			for(int j = 1; j<=10; j++) { //j를 1부터 10까지 출력한다.
					System.out.printf("*"); //*을 10까지 출력하고 
				}
					System.out.println(); //칸을 변경해준다.
				}
		//for문이 끝날 때 까지 i를 5번 진행하고 j변수로 *을 10번 찍는다.
	}

}
