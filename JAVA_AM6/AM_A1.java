package JAVA_AM_20220405;

import java.util.Scanner;

public class AM_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; // �Է� ���� ���� ����
		// double type �迭�� ���� �����
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ������ �Է��ϼ���.");
		//int type���� ���� �Է��ϱ�
		count = sc.nextInt();
		//�Է��� ���� (����)  ��ŭ �迭�� �����ؼ� �����̸��� ���� 
		// �Է� ���� ����; //�Ҽ������� ��Ÿ���� ���� double type ��� 
		double[] Arr = new double[count];
		//double [] Arr;
		//Arr = new double[count];

		System.out.println(count + "���� ���ڸ� �Է��ϼ���.(�Ҽ����� ����)");
		
		//Arr[i]�� ���
		for (int i = 0; i < count; i++) {
			//�Է��� �������� i�� ������ (10���� �־��ٸ� 10���� ���ư�)
			//Arr[0],Arr[1],Arr[2],Arr[3],Arr[4]..
			//nextDouble �޼ҵ�� Arr[i]�� ����. //nextInt �޼ҵ�δ� �����ܿ� ���� ����.
			Arr[i] = sc.nextDouble();
		}
		
		
		//Arr�� ũ�⸸ŭ i�� ������.
		for (int i = 0; i < Arr.length; i++) {
			//Arr�� ũ�⸸ŭ j�� ������.  
			for (int j = i + 1; j < Arr.length; j++) {
				//Arr[i]�� ���� Arr[j]�� ���� ������ �ߺ��� ���ڸ� ���.
				if (Arr[i] == Arr[j]) {
					System.out.println("Duplicated number is :" + Arr[i]);
				}
			}
		}
	}
}
