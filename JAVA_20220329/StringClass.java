package JAVA_20220329;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello,hi";
//		System.out.println(text);
//		System.out.println(text.length());
//		System.out.println(text.charAt(2));
//		
		char[] c = text.toCharArray();  //
		System.out.println(c[0]); //0번째 단어는 뭐냐?
		
		System.out.println(text.replace("H", "h"));//H를 h로 바꿔라
	
		String[] t = text.split(","); //, 아래는 날려라
     	System.out.println(t[0]); //0번째 뺴고 날려라
	    System.out.println(t[1]); //1번째 빼고 날려라
////		System.out.println(t[2]); //array index out of
	}
}
