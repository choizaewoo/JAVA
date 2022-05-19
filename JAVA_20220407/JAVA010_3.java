package JAVA_20220407;

public class JAVA010_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private int i = 0;
		
		@Override
		public void run()
		while(true) {
			try {
				showSec();
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}
	
	private void showSec() {
		System.out.println((++i) + "√ ");
	}

}