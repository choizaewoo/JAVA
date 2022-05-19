package JAVA_20220407;

public class JAVA010_7 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		Thread thread = new Thread(main);
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println("Tread");
	}

}
