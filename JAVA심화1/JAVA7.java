package JAVA;

public class JAVA7 {

	public static int k42_taxcal(int k42_val, int k42_rate) { // taxcal�� ���ݰ�� ����. val�� �������� rate�� ���� % �̴�. ex) 3 = 3%
		int k42_ret; //
		
		if( ((double)k42_val*(double)k42_rate/100.0) == k42_val*k42_rate/100) { //if�� �Ǽ��� val�� �Ǽ���rate�� ���ϰ� 100���� ���� ���� ������ val�� ������ rate�� ���ϰ� 100���� �������̶� 
			//���ٸ�
			k42_ret = k42_val*k42_rate /100; //���ǰ��� ������ ���� ���� 100���� ������ ���� ���� ���� ����س���. 8.17
		}else { 
			k42_ret = k42_val*k42_rate/100+1;  //�Ǽ����� �������� ����� ���� 1�� �����ش�. ���ǰ��� ������ ���� ���� 100���� ������ +1�� ���ָ� �������� ���´�. 
		}
			return k42_ret; //��� ���� �����Ѵ�
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k42_val = 271; //���ǰ��� 271�� �ִ´�.
		int k42_rate = 3; // ������ 3���� �ִ´�.
		
		int k42_tax = k42_taxcal(k42_val,k42_rate); // Ŭ�������� �޾ƿ� ���� tax�� �־��ش�. 
		
		int k42_aftertax = k42_val + k42_tax; //���ǰ��� ������ ���ؼ� ���� ���ǰ����� �־��ش�.
		
		System.out.printf("**********************************\n");
		System.out.printf("*           �ܼ� ���� ���          *\n");
		System.out.printf("���� ���� ��� : %f\n", k42_val*k42_rate/100.0); //���� ���� ��� ���� ���ǰ� * ���� /100.0 
		
		System.out.printf("�������� : %d ���� : %d �������԰��� : %d\n", k42_val, k42_tax, k42_aftertax); // �������� 271 ���� 9 ���� 280  
		System.out.printf("**********************************\n");
		
	}

}
