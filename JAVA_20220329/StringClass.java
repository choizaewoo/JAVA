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
		System.out.println(c[0]); //0��° �ܾ�� ����?
		
		System.out.println(text.replace("H", "h"));//H�� h�� �ٲ��
	
		String[] t = text.split(","); //, �Ʒ��� ������
     	System.out.println(t[0]); //0��° ���� ������
	    System.out.println(t[1]); //1��° ���� ������
////		System.out.println(t[2]); //array index out of
	}
}
