package JAVA_20220407;

public class JAVA010_9_100second extends Thread {

	// TODO Auto-generated method stub
	/** * Ÿ�̸� ������ * */
	/** * �ʸ� ǥ���� ���� */
	private int i = 0;

	@Override
	public void run() { // ��� �ʸ� ǥ���ϱ� ���ؼ�..
		while (true) {
			try { // 1�ʸ��� �޽��� ǥ��
				showSec(); // 1�ʸ��� ����
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/** * �޽��� ǥ�� */
	private void showSec() {
		System.out.println((++i) + "��");
	}

	

	public static void main(String[] args) {

		JAVA010_9_100second thread = new JAVA010_9_100second(); //class�� ������
		thread.start();
	}

}
