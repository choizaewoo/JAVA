package JAVA_20220405;

public class ArrayPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float average = 0;
		
		int[] score = {100,90,80,100,40};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("ÃÑÇÕ : " + sum);
		System.out.println("Æò±Õ : " + average);
	}
}
