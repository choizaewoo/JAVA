package JAVA_20200331;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input_Ch;

		int a, b;

		Scanner scan = new Scanner(System.in);

		System.out.println("+, -, *, / 연산중 하나를 입력하세요");

		input_Ch = scan.nextLine();

		switch (input_Ch) {

		case "+":

			System.out.println("숫자를 두개 입력하세요");

			a = scan.nextInt();

			b = scan.nextInt();

			printHello(a, b);

			break;

		case "-":

			System.out.println("숫자를 두개 입력하세요");

			a = scan.nextInt();

			b = scan.nextInt();

			printHello2(a, b);

			break;

		case "*":

			System.out.println("숫자를 두개 입력하세요");

			a = scan.nextInt();

			b = scan.nextInt();

			printHello3(a, b);

			break;

		case "/":

			System.out.println("숫자를 두개 입력하세요");

			a = scan.nextInt();

			b = scan.nextInt();

			printHello4(a, b);

			break;

		default:

			System.out.println("+, -, *, / 연산중 하나를 입력하세요");

			break;

		}

	}

	public static void printHello(int num, int age) { // 매개변수 - 함수를 호출할 때 저기에 값을

		// 넣어줘야 함

		System.out.print(num + "+" + age + "=" + (num + age));

	}

	public static void printHello2(int num, int age) { // 매개변수 - 함수를 호출할 때 저기에

		// 값을

		// 넣어줘야 함

		System.out.print(num + "-" + age + "=" + (num - age));

	}

	public static void printHello3(int num, int age) { // 매개변수 - 함수를 호출할 때 저기에

		// 값을

		// 넣어줘야 함

		System.out.print(num + "*" + age + "=" + (num * age));

	}

	public static void printHello4(int num, int age) { // 매개변수 - 함수를 호출할 때 저기에

		// 값을

		// 넣어줘야 함

		System.out.print(num + "/" + age + "=" + (num / age));

	}

}
