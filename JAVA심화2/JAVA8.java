package JAVA2;

public class JAVA8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k42_i = 1; k42_i < 13; k42_i++) { // ���� i�� 12���� �ݺ��Ѵ�
			System.out.printf(" %d�� =>", k42_i); // ���� i�� 12���� 1�� ������Ű�鼭 �ݺ� ������ش�.
			for (int k42_j = 1; k42_j < 32; k42_j++) { // ���� j�� 31���� �ݺ� 1�� ������Ű�鼭 ����Ѵ�.

				System.out.printf("%d,", k42_j); // ���� j�� ������ش�. ����ó���� �����ʴ´�.

				if ((k42_i == 4 || k42_i == 6 || k42_i == 9 || k42_i == 11) && (k42_j == 30)) //if ����i�� 4 6 9 11 �̸鼭 j�� 30�̶��
					break; //�극��ũ�� ���´�.
				if (k42_i == 2 && k42_j == 28) //if ����i�� 2�̸鼭 ����j�� 28�̶�� 
					break; //�극��ũ�� ���´�.
			}
			System.out.printf("\n"); ////for�� �ȿ��� �� ��¸��� ����ó���� �Ѵ�. 
		}
	}
}
