package JAVA_20220329;

import java.util.Scanner;



public class P3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] choSung = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		"��" };
		String[] jungSung = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		"��", "��", "��" };
		String[] jongSung = { "", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
		"��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };

	
		String Hanguel = "��Ÿ�������̽��Ƹ޸�ī��";

		for (int i = 0; i < Hanguel.length(); i++) {
			char uniVal = Hanguel.charAt(i);
			//�ʼ����� = �ѱ۹����ڵ� - 0xAC00(�ѱ۽�����) /21(�߼�����) / 28(��������) 
			char cho = (char) ((uniVal - 0xAC00) / 28 / 21);
			//�߼����� = �ѱ۹����ڵ� - 0xAC00 / 28 (���������� ������) % 21 (�߼��� ���������� ���)
			char jung = (char) ((uniVal - 0xAC00) / 28 % 21);
			//�������� = �ѱ۹����ڵ� - 0xAC00 % 28 (���̰��� ������ ������ ������) 
			char jong = (char) ((uniVal - 0xAC00) % 28);
			System.out.println(choSung[cho] + jungSung[jung] + jongSung[jong]);
		
		}
	}
}
