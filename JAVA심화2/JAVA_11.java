package JAVA2;

public class JAVA_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumVal = 1001034567; // int ������ ���� iNumVal�� �������ش�.

		String sNumVal = String.valueOf(iNumVal); //String ���ڿ� ���� sNumVal�� �����԰� ���ÿ� int�� �������� ���ڿ� ���·� ��ȯ�Ѵٴ� ���� sNumVal�� �����Ѵ�. 
		String sNumVoice = ""; //���ڿ� ���� sNumVoice�� ""�� ����. 

		System.out.printf("==> %s [%d�ڸ�]\n", sNumVal, sNumVal.length()); // ���ڿ� sNumVal�� �������� iNumVal�� ��������� ������ 1001034567�� ��µ�. sNumVal.length�� iNumVal��
		//���� ��ŭ ��µȴ�. �� 10���� ���� ��µȴ�.

		int i, j; // int�� ���� i�� j�� ���� �������ش�.

		String[] units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // String ���ڿ� �迭�� ������ units���� �������ش�. 
		String[] unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; //String ���ڿ� �迭�� ������ unitX�� �������ش�.

		i = 0; // ����i�� 0���� �ʱ�ȭ�Ѵ�.
		j = sNumVal.length() - 1; // sNumVal�� String.valueOf(iNumVal)�� ����ȯ�� �����־����� iNumVal�� ���̰� ��µǴϱ� ���ڿ����̿��� 1�� ���ִ� ���� ���� j�� �����Ѵٴ� ���� �����Ѵ�.
															//(int���� string������ �ٲ��شٴ� ����)
		while (true) { //���ǽ��� ����� true�� �ݺ� �����Ѵ�. 
			if (i >= sNumVal.length()) // if�� ���� i�� ���ڿ� ���̺��� Ŭ ��  
				break; //�극��ũ���� ���ؼ� ���´�.

			System.out.printf("%s[%s]", sNumVal.substring(i, i + 1), //substring�� ���ؼ� ���ڿ��� �ɰ��� ����� �� �ִ�. ���� ���� i�� 1�� ������ beginIndex�� 1�̰� endIndex�� 2�̴�.
					// �� %s���� '1'�� ��µȴ�. 
					units[Integer.parseInt(sNumVal.substring(i, i + 1))]); // //substring�� ���ؼ� ���ڿ��� �ɰ���, ���� ���� i�� 1�� ������ beginIndex�� 1�̰� endIndex�� 2�̴�.
					// �� ���ڿ� 1�� �ٽ� ���������� �����ϴ� ���̴�. �׷��� unit[1]�� �Ǵµ� units �迭�� 1��°�� "��"�̴�. 
			
												//���ڿ� �񱳴� equals�� ����.
			if (sNumVal.substring(i, i + 1).equals("0")) { // ���� ���� i�� 1�� �־��ٸ� (1,2)�̱� ������ ������ ���ڿ� iNumVal�� 1�� �ȴ�. �̰� ���ڿ� 0�� ���� ��.
				if (unitX[j].equals("��") || unitX[j].equals("��")) { 
					sNumVoice = sNumVoice + "" + unitX[j];
				} else {
						//�ƹ��͵� �ƴ϶�� �ƹ��͵� ����.
				}

			} else {
				sNumVoice = sNumVoice + units[Integer.parseInt(sNumVal.substring(i, i + 1))] + unitX[j];
			}
			i++;
			j--;
		}

		System.out.printf("\n %s[%s]\n", sNumVal, sNumVoice);
	}
}
