package JAVA_20220406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JAVA009_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> number = new ArrayList<Double>();

		for (int i = 0; i < 10; i++) {
			number.add(Math.random() * 10);
		}

		number.remove((number.size() / 2));
		number.remove((number.size() / 2));
		
		Collections.sort(number);
		System.out.println(number);
		
		
		
	}
}
