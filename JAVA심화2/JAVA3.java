package JAVA2;

public class JAVA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //sum�� �ʱ�ȭ �����ش�
		int i = 0; //i�� �ʱ�ȭ�����ش�.
		
		while(true) { //��µ� ���ǽ��� true�� �ݺ� �����Ѵ�.
			if(sum>100)  //���� sum�� 100���� ũ��
				break; //�����. �׷��� ���� ������ �ݺ�����Ǵ� ���̴�. 1���� 10������ ���� 55��. ����. �׷��� ��� i�� 10�̻��̴�.
			++i;  // ++i�� ���ش� ( ���� ĭ�� +1�� ����) 1�� ������ ���� ���ڷ� 2�� ���� 2�� ������ ���� ���ڷ� 3�� ����. �׷��� ��� ���ư��鼭 ����(sum)�� 100�� �ѱ�� ������ ã�� ��.
			sum+=i; // sum�� i���� �����Ѵ�. 1���� ���. sum�� 100�� �ѱ� �� ����.
		}// end of while

		System.out.println("i=" + i); //i�� 14���� ���ư���.  
		System.out.println("sum=" + sum); //1���� 14������ sum��. 105�̱� ������ 100���� Ŀ�� break ���ߴ�.
	}
	}


