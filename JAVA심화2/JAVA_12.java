package JAVA2;

public class JAVA_12 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //for문 정수형 int의 변수 i를 0부터 9까지 1씩 증가시키면서 반복한다.
			for (int j = 0; j < i; j++) //for문 변수 j를 0부터 i까지 1씩 증가시키면서 반복해준다.
				System.out.printf(" "); //띄어쓸 칸 만큼 빈칸을 출력시킨다. 빈칸을 하나 두었기 때문에 한칸씩 띄어진다.
			System.out.printf("%d\n", i); //i값을 출력시켜준다.
		}
	}

}
