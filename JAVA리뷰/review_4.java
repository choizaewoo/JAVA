package review;

import java.util.Scanner;

public class review_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 0 �Ǵ� 1�� �ݺ��Ͽ��� 4�ڸ��� �Է��ϼ���.");

		String[] s = new String[3];
		
		int vPass = 0;
	
		s[0] = sc.nextLine();
		s[1] = sc.nextLine();
		s[2] = sc.nextLine();

		//horizon condition
		for (int j = 0; j < 3; j++) { //String[3] �� s�� ���� �ݺ���
			int zeroCount = 0;	//���ڿ��� ���� 0�� ���� ���� ����
			for (int i = 0; i < 4; i++) { //s[i]�� ���ڿ� �ݺ���
				if (s[j].charAt(i) == '0') { //���ڿ����� 0�� ���� ������
					zeroCount++; //�������� 1 ���
				}
			}
			if (zeroCount == 4) { //�� ���ڿ��� 0�� ���� �װ��� �Ǹ� == �ѹ��ڿ��� ���� 0�̸�
				vPass++; //�� ������ ���� 1 ���
			}
		}
		
		//vertical condition
		for (int i = 0; i < 4; i++) { //���ڿ� �迭�� �ϳ��� �����ͼ� charAt���� �ϳ��� �ɰ��� 0�϶��� ���Ѵ�.
			if (s[0].charAt(i) == '0' && s[1].charAt(i) == '0' && s[2].charAt(i) == '0') {
				vPass++; //1�� ���
			}
		}
		
		//print part
		if (vPass != 0) { //�տ��� ��µ� vPass�� 1�� �ƴϸ� pass
			System.out.println("pass");
		} else { //0�̸� fail.
			System.out.println("Fail");
		}
	}
}
