package JAVA2;

public class JAVA_12 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { //for�� ������ int�� ���� i�� 0���� 9���� 1�� ������Ű�鼭 �ݺ��Ѵ�.
			for (int j = 0; j < i; j++) //for�� ���� j�� 0���� i���� 1�� ������Ű�鼭 �ݺ����ش�.
				System.out.printf(" "); //�� ĭ ��ŭ ��ĭ�� ��½�Ų��. ��ĭ�� �ϳ� �ξ��� ������ ��ĭ�� �������.
			System.out.printf("%d\n", i); //i���� ��½����ش�.
		}
	}

}
