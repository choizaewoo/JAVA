package JAVA_AM_20220406;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "kevin 100", "Tom 97", "John 85", "Jack 93", "Park 97" };
		int[] numArr = new int[5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (Integer.parseInt(arr[j].replaceAll("[^0-9]", "")) < Integer
						.parseInt(arr[j + 1].replaceAll("[^0-9]", ""))) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

	}
}
