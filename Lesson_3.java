import java.util.Scanner;

public class Lesson_2 {
	public static void main (String[] args) {

		int num1 = ReadNumber();
		int num2 = ReadNumber();
		int result = sum(num1, num2);
		System.out.println("Sum = " + result);
	}
	
		public static int readNumber() {

			Scanner sc = new Scanner(System.in);
			System.out.println("¬ведите число: ");
			return sc.nextInt();
		}

		public static int sum (int num1, int num2) {

	 		return num1 + num2;
		}
	
}