package JAVA6;

public class JAVA2 {

	static int iStatic; // 클래스 내 전역 변수 static에 주의

	public static void add(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n", iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", i);
	}

	public static int add2(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n",iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", i);
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iMain;
		
		iMain = 1;
		iStatic = 1;
		
		System.out.printf("***************************************\n");
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n",iStatic);
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n",iMain);
		System.out.printf("***************************************\n");

		add(iMain);
		
		System.out.printf("***************************************\n");
		System.out.printf("메소드호출후 메인에서->iStatic=[%d]\n",iStatic);
		System.out.printf("메소드호출후 메인에서->iMain=[%d]\n",iMain);
		System.out.printf("***************************************\n");
		
		iMain=add2(iMain); 
		
		System.out.printf("***************************************\n");
		System.out.printf("메소드add2호출후 메인에서->iStatic=[%d]\n",iStatic);
		System.out.printf("메소드add2호출후 메인에서->iMain=[%d]\n",iMain);
		System.out.printf("***************************************\n");
		
		
		
	}
}
