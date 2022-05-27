package JAVA_AM_20220401;

import java.util.Scanner;

public class PrintClass {

	public void printSelect() {

		System.out.println("Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");

	}

	public void printCourseList() {
		Scanner sc = new Scanner(System.in);
		PrintClass room = new PrintClass();
		int knt = 0, mnt = 0, ent = 0, ssnt = 0, snt = 0, bnt = 0;

		while (true) {
			int selection = sc.nextInt();
			if (selection == 1) {
				System.out.println("수강할 과목을 선택하세요");
				System.out.print("1.Korean\n" + "2.Math\n" + "3.English\n" + "4.Social Studies\n" + "5.Sience\n"
						+ "6.Back to Main");
				int courseSelect = sc.nextInt();

				if (courseSelect == 1) {
					System.out.println("1.korean를 선택하셨습니다.");
					knt++;
					room.printSelect();
				} else if (courseSelect == 2) {
					System.out.println("2.Math를 선택하셨습니다.\n");
					mnt++;
					room.printSelect();
				} else if (courseSelect == 3) {
					System.out.println("3.English를 선택하셨습니다.");
					ent++;
					room.printSelect();
				} else if (courseSelect == 4) {
					System.out.println("4.Social Studies를 선택하셨습니다.");
					ssnt++;
					room.printSelect();
				} else if (courseSelect == 5) {
					System.out.println("5.Sience를 선택하셨습니다.");
					snt++;
					room.printSelect();
				} else if (courseSelect == 6) {
					System.out.println("6.Back to Main를 선택하셨습니다.");
					room.printSelect();
					break;
				} else {
					System.out.println("똑바로 입력하세요를 선택하셨습니다.");
					room.printSelect();
				}

			} else if (selection == 2) {
				System.out.println("My Course");
				if (knt == 1) {
					System.out.println(" - korean");
				}
				if (mnt == 1) {
					System.out.println(" - Math");
				}
				if (ent == 1) {
					System.out.println(" - English");
				}
				if (ssnt == 1) {
					System.out.println(" - Social Studies");
				}
				if (snt == 1) {
					System.out.println(" - Sience");
				}
				if (bnt == 1) {
					System.out.println(" - Back to Main");
				}
			}
		}
	}
}
