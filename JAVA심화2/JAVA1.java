package JAVA2;

public class JAVA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int sum = 0; //sum�� �ʱ�ȭ �����ش�
	//	for (int i = 0; i < 10; i++) { // i�� 9���� ������. 
	//		sum = sum+i; //�հ迡 1���� 9���� �����ش�.
	//	}
	//	System.out.printf("sum : %d\n", sum); //�հ踦 ������ش�.
		
		
		for (int i=1; i < 10; i++) { //i�� 1���� 9���� �ݺ��Ѵ�.
			System.out.printf("******************\n"); 
			System.out.printf("������ %d ��\n",i); //������ 1�� ~ ������ 9�� ���.
			System.out.printf("******************\n"); 
			for (int j = 1; j < 10; j++) { // j�� 1���� 9���� �ݺ��Ѵ�.
				System.out.printf(" %d * %d = %d\n", i, j, i * j); //i���� 1�� ����. j���� 1���� 9���� ���ư��� i*j���� ��µȴ�.
				//�ٽ� i�� for������ �ö󰡼� �ݺ��Ѵ�.
			}
		}
	}

}
