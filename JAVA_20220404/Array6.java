package JAVA_20220404;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2 , 3, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		for( int i = 0; i < arr.length; i++) {
			for ( int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		
		}
		
		System.out.println("큰 수 부터 출력");
		for( int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
	}

}
		
