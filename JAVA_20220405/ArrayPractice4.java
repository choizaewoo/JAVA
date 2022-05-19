package JAVA_20220405;

public class ArrayPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}else if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("ÃÖ´ñ°ª : " + max);
		System.out.println("ÃÖ¼Ú°ª : " + min);
	}
}
