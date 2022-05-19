package JAVA_20220406;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class JAVA009_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> ranNum = new LinkedList<Integer>(); 
		Random rand = new Random();
		
		int r = rand.nextInt();
		
		for (int i = 0; i < 20; i++) {
			if ( i % 2 != 0) {	
				ranNum.add((int) (Math.random() * 30));
			}
		}
		System.out.println(ranNum);
	}
}
