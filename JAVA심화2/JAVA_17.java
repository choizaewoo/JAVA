package JAVA2;

public class JAVA_17 {

	public static void main(String[] args) {
		for (int k42_i = 1; k42_i < 13; k42_i++) {// ���� i�� 12���� 1�� ������Ű�鼭 �ݺ��Ѵ�
			System.out.printf(" %d�� =>", k42_i); // ���� i�� ����Ѵ�.
			LOOP: for (int k42_j = 1; k42_j < 32; k42_j++) { // ����j�� 1���� 31���� 1�� ������Ű�鼭 �ݺ��Ѵ�.
				System.out.printf("%d", k42_j); // ���� j�� ����Ѵ�.

				switch (k42_i) { // switch ��ȣ�ȿ� ������ �����Ѵ�.
				case 4: // ����i�� 4�� �� if���� ����Ѵ�. 
				case 6: // ����i�� 6�� �� if���� ����Ѵ�.  
				case 9: // ����i�� 9�� �� if���� ����Ѵ�. 
				case 11: // ����i�� 11�� �� if���� ����Ѵ�. 
					if (k42_j == 30) // ����j�� 30�̶��
						break LOOP; // LOOP�� Ż���Ѵ�.

					break; // �극��ũ�� ������.
					
				case 2: // ����j�� 2�� �� if���� ����Ѵ�. 
					if (k42_j == 28) // ����j�� 28�̶��
						break LOOP; // LOOP�� Ż���Ѵ�.
					
					break; // �극��ũ�� ������.

				}
			}
			System.out.printf("\n"); // for�� �ȿ��� �� ��¸��� ����ó���� �Ѵ�.
		}
	}

}
