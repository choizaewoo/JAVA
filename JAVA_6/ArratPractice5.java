package JAVA_20220405;

import java.util.Arrays;

public class ArratPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < 10; i++) {
			//0�� 10���̿��� ������ ��ȯ.
			int n = (int)(Math.random() * 10);
			//numArr[0]�� numArr[n]�� ���� ���� �ٲ�
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}

}
