package JAVA2;

public class JAVA4 {

	public static void main(String[] args) {
		
		int k42_il; //������ ���� il
		double k42_iD; //�Ǽ��� ���� iD
		
		k42_il = 10/3; // 3.333333�� �ƴϴ�. �������̱� ����.
		k42_iD = 10/3.0; //3.333333�̴�. �Ǽ����̱� ����.
		
		if (k42_il == k42_iD) { //���� il�� iD�� ���ٸ�~ (���� �ʰ���.)
			System.out.println("equal"); //equal ���.			
		} else {  // ���� �ʴٸ�!
			System.out.printf("Not equal[%f][%f]\n", (double)k42_il,k42_iD); //il�� �Ǽ��� double�� ����ȯ�� �����ְ� ����ϰ�, double�� iD�� ����Ѵ�.
		}
		
		if (k42_iD == 3.333333) { // ���� ��ȿ���ڱ��� ǥ�ø� �� �Ŷ� ������ �ٸ���.
			System.out.println("equal"); //equal ���.
		}else {//�׷��������� 
			System.out.printf("Not equal[3.333333][%f]\n", k42_iD); //iD�� ����Ѵ�. 
		}
		//�ٱ�ġ��
		k42_iD = (int)k42_iD; //int������ ����ȯ�� iD������ double�� iD������ ����.
		if (k42_il == k42_iD) { //���� ���� ������ 
			System.out.printf("equal\n"); //equal!!
		}else { //�׷��� �����!!
			System.out.printf("Not equal[%f][%f]\n", (double)k42_il,k42_iD); //������ ����il�� �Ǽ������� ����ȯ�� �ؼ� ���. �׸��� iD�� ���������� ���. 
		}
		
		System.out.printf("int�� �μ�[%d][%f]\n", k42_il, k42_iD);//������ ���� il�� ����Ѵ�. 3�� ��µ�. �׸��� iD������ ���������� ����ȯ�� �����־��� ������. float���� �޾����� 3.000000�� ��µȴ�.
		System.out.printf("double�� �μ�[%f][%f]\n", (double)k42_il, k42_iD); //���������� il�� double �Ǽ������� ����ȯ�ؼ� ����Ѵ�. �Ǽ�������iD�� float���� �޾Ƽ� ���.
		
		char k42_a = 'c'; // ������ char�� ������ a�� ����. 'c'�� �޾��ش�.
		
		if (k42_a=='b') { //���� ����a�� b��� 
			System.out.println("a�� b�̴�"); //a�� b����
		}
		if (k42_a=='c') { //���� ����a�� c��� 
			System.out.println("a�� c�̴�."); //c����.
		}
		if (k42_a=='d') { //�þ� ����a�� d��� 
			System.out.println("a�� d�̴�."); //d�� �ʰγ�.
		}
		
		
		}
	}

