package JAVA2;

public class JAVA_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fSin; //�Ǽ��� ������ fSin�� �����Ѵ�.
		
		for (int i = 0; i < 360; i++) { // for�� i�� 0���� 359���� 1�� ������Ű�鼭 �ݺ���ų ���̴�.
			
			fSin =Math.sin(i * 3.141592/180); //�Ǽ��� ����fSin�� sin���� �������ش�. 
			System.out.printf("%d sin ==> %f\n",i,fSin); // i�� fsin ���� ������ش�.
		}
		
		for (int i =0; i < 360; i++) { // i�� 0���� 359���� �ݺ��Ѵ�.
			fSin = Math.sin(i* 3.141592/180); // ���� fsin�� �����Ѵ�.
			
			int iSpace = (int)((1.0-fSin) * 50); //���������� �����ؼ� ispace��ŭ ���ٴ� ��.
			for (int j = 0; j < iSpace; j++) System.out.printf(" ");
			System.out.printf("*[%f][%d]\n",fSin,iSpace);
			
		}
	}

}
