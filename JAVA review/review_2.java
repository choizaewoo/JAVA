package review;

import java.util.Scanner;
//���ڿ��� ���ڷ� �񱳸� �ض�. 
public class review_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert any words !");
		String a = sc.nextLine(); //���ڿ� ���� �ޱ�
		String b = sc.nextLine(); //���ڿ� ���� �ޱ�

		char chars[] = a.toCharArray(); // ���ڿ��� tochararray�� �ϳ��� �ɰ��� chars[] �迭�� �־��ش�.

		int o = 0; //��... ���� �ϳ��� ������ְ� 0���� �ʱ�ȭ�����ش�.
		for (int i = 0; i < chars.length; i++) { //i�� �ɰ��� ���ڿ����̱��� �����ش�.
			if (b.contains(String.valueOf(chars[i]))) { // ���Ϸ��� ���ڿ� b�� �迭�� ���� ���ڿ��� �ٲ��� ������ �����Ѵٸ� 
				o++; //�ϳ��� ���������ش�. (���ڿ����̸�ŭ)
			} else if (b.contains(String.valueOf(chars[i])) != true) { //�ݴ�

			}
		} //for�� �ݱ�

		if (o == chars.length) { // o�� chars�� ���̸�ŭ�� ���ٸ�(���ڰ� ���ٸ�)
			System.out.println("yes"); //yes�� ���.
		} else { // �ƴ϶��~
			System.out.println("No"); //no
		}
	}
}

//		if (chars.contains(chars2)) {
//			
//			System.out.println("yes");
//			
//			}
//		}
//	}


