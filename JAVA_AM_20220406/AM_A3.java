package JAVA_AM_20220406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AM_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		}

		public static void print() {
			Scanner sc = new Scanner(System.in);
			List<Integer> numList = new ArrayList<Integer>();
			int sum = 0;
			while (true) {
				numList.add(sc.nextInt());
				for (int i = 0; i < numList.size(); i++) {
					sum += numList.get(i);
				}
				System.out.println("Result : " + numList.size() + " - Mean : " + sum / numList.size() + ", Max : "
						+ Collections.max(numList) + ", Min : " + Collections.min(numList));
				sum = 0;
			}

		}

	}
	


