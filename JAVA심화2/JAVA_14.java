package JAVA2;

public class JAVA_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_n, k42_m; // ������ ���� n�� m�� �������ش�.
		k42_m = 20; // m������ 20�� �־��ش�.
		k42_n = 1; // n������ 1�� �־��ش�.

		while (true) { // ���ǹ��� ����� true�� ������ �ݺ��Ѵ�.
			for (int i = 0; i < k42_m; i++) // for�� i�� 0���� m���� 1�� ������Ų��.
				System.out.printf(" ");// i�� m���� �ݺ��ϸ鼭 ��ũ�� �ϳ��� �ø���.
			for (int i = 0; i < k42_n; i++) // for�� i�� 0���� n���� 1�� ������Ų��.
				System.out.printf("*");// ���� �ϳ��� �ø��鼭 ����Ѵ�.
			System.out.printf("\n"); // ��¸��� ����ó���� �Ѵ�.

			k42_m = k42_m - 1; // 20���� �ϳ��� �������ִ�
			k42_n = k42_n + 2; // 2���� �ø����ִ�.

			if (k42_m < 0)
				break;
		}
	}

}
