package JAVA2;

public class JAVA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //sum을 초기화 시켜준다
		int i = 0; //i를 초기화시켜준다.
		
		while(true) { //출력된 조건식이 true면 반복 진행한다.
			if(sum>100)  //만약 sum이 100보다 크면
				break; //멈춘다. 그러니 멈출 때까지 반복진행되는 것이다. 1부터 10까지의 합은 55다. 참고. 그러니 적어도 i는 10이상이다.
			++i;  // ++i를 해준다 ( 다음 칸에 +1을 해줌) 1을 넣으면 다음 인자로 2가 들어가고 2를 넣으면 다음 인자로 3이 들어간다. 그렇게 계속 돌아가면서 총합(sum)이 100을 넘기는 순간을 찾는 것.
			sum+=i; // sum에 i값을 저장한다. 1부터 계속. sum이 100을 넘길 때 까지.
		}// end of while

		System.out.println("i=" + i); //i는 14까지 돌아갔다.  
		System.out.println("sum=" + sum); //1부터 14까지의 sum값. 105이기 때문에 100보다 커서 break 당했다.
	}
	}


