package JAVA_20220407;

public class JAVA010_9_100second extends Thread {

	// TODO Auto-generated method stub
	/** * 타이머 쓰레드 * */
	/** * 초를 표시할 변수 */
	private int i = 0;

	@Override
	public void run() { // 계속 초를 표시하기 위해서..
		while (true) {
			try { // 1초마다 메시지 표시
				showSec(); // 1초마다 슬립
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/** * 메시지 표시 */
	private void showSec() {
		System.out.println((++i) + "초");
	}

	

	public static void main(String[] args) {

		JAVA010_9_100second thread = new JAVA010_9_100second(); //class를 가져옴
		thread.start();
	}

}
