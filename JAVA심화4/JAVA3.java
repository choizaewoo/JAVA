package JAVA4;

public class JAVA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_iWeekday = 5; // weekday�� ������ ������ �����ϰ� 5�� �����Ѵ�.
		int[] k42_iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �� ���� ������ ����д�.
		// 1������ 12������ ����Ѵ�. 1�� �����ϸ鼭 �ݺ����� ����.
		for (int k42_iMon = 0; k42_iMon < 12; k42_iMon++) {
			// 1������ ����� ���ش�.
			System.out.printf("\n\n		      %d��\n", k42_iMon + 1);
			System.out.printf("=====================================================\n");
			System.out.printf("��	��	ȭ	��	��	��	��\n");
			// 0���� weekday���� ���� ������ ����Ѵ�.
			for (int i = 0; i < k42_iWeekday; i++) {
				System.out.printf("	");
			}
			// ���� i�� 1���� �迭 iEnd�� �־ �� ���ϱ��� �߰��ϸ鼭 �ݺ����� ����ȴ�.
			for (int i = 1; i <= k42_iEnd[k42_iMon]; i++) {
				// ���� i�� 1���� ���� 31���� ����.
				System.out.printf("%d	", i);
				// weekday�� ������Ű�� 7�� �Ǹ� ����ó���� �ϰ� 0�� ������ָ� �ٽ� �ݺ����� ����ǵ��� for�� ù�ٷ� �ö󰣴�.
				k42_iWeekday++;
				if (k42_iWeekday == 7) {
					System.out.printf("\n");
					// weekday�� 0���� �����ϰ� �ٽ� ù�ٺ��� �����ϰԵȴ�.
					k42_iWeekday = 0;

				}

			}
		}
	}
}
