package JAVA;

public class JAVA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum; // c�� �� �տ����� �����ؾ� ������, c++,java�� �ʿ��� �� �����ص� ��. 
		
		sum = 0; //����, ������ �� �ʱ�ȭ
		
		//1���� 100���� ���غ���.
		for (int k42_i =1; k42_i < 101; k42_i++) {
			sum = sum + k42_i;
		}
		System.out.println("#2 : " + sum);
		// ����� ó���Ѵٸ� ���⼭ �� ���� ���� �Ѵ�.
		// ����� ���Ѵ�. 100���� �������� ������.
		System.out.println("#2-2 : " + sum/100); //sum���� ��µ� ���� 100���� ������.
		
		//�迭�� �̿��Ѵ�. int �迭�� v������ 1,2,3,4,5�� ���ʴ�� �־��ش�
		int [] v = {1,2,3,4,5};
		//��
		int vSum; //���� ������ �޾Ƶ��δ�.
		
		vSum = 0; //sum�� �׻� �ʱ�ȭ�� �����ش�
		
		for (int k42_i = 0; k42_i < 5; k42_i++) { //i�� 0���� 5���� ������
			vSum= vSum + v[k42_i]; //i�� 1���� sum���� �����ְ� 4���� �����ش�.
		}
		
		System.out.println("#2-3 : " + vSum);//vSum���� ������ش�.
		
	
	}	
}
