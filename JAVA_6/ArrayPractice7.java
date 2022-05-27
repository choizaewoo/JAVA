package JAVA_20220405;

public class ArrayPractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"kim", "lee", "park"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("names["+ i + "]" + names[i]);
		}
		
		String tmp = names[2]; //park
		System.out.println("tmp :" + tmp); //tmp : park
		names[0] = "Ryu"; //kim을 Ryu로 바꾼다.
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}

//String str = "ABCDE";
////char ch = str.charAt(3);
//문자열 str의 4번째문자 'D'를 ch에 저장 

