package JAVA2;

public class JAVA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_iVal; //int ������ ���� iVal�� ����.
		for (int k42_i = 0; k42_i < 300; k42_i++) { //i�� 0���� 299���� �ݺ��Ѵ�. 1�� ������Ű�鼭.
			k42_iVal = 5 * k42_i; // 5 10 15 20 25 30 35 .. 1495 (299���� ���ϱ�)
			if (k42_iVal >= 0 && k42_iVal < 10) { //if��. ���� iVal������ 0���� ũ�ų� �����鼭 10���ٴ� ������ ~
				System.out.printf("�� %d\n", k42_iVal); // �Ͽ��� 0�̶� 5�ۿ� �� ��. 10���� ���� �� 5*0 5*1 ���̴ϱ�.
			} else if ( k42_iVal >= 10 && k42_iVal < 100) { // 10���� ũ�ų� �����鼭 100���� ������ 
				System.out.printf("�� %d\n", k42_iVal); // 5*2 ~ 5 *19 ���� ���õ�
			} else if ( k42_iVal >= 100 && k42_iVal < 1000) { //100���� ũ�ų� �����鼭 1000���� ������
				System.out.printf("�� %d\n", k42_iVal); // 5*20 ~ 5*195 ���� ����
			} else {  //������ ���� �ƴϸ�~~~
				System.out.printf("õ %d\n", k42_iVal); //������ ���� ���.
			}
		}
	}

}
