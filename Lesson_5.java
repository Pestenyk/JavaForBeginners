public class Lesson_5 {
	public static void main(String[] args) {

		printNum();
		sumNum();
	}

		// A loop that prints numbers from 1 to 22 inclusively to the console
		public static void printNum() {
			for(int i = 1; i<= 20; i++) {
				System.out.print(" " + i);
			}
			System.out.println("\n");
		}
	
		// We deduce the sum of numbers from 1 to 112 in steps of 3
		public static void sumNum() {
			int result = 0;
			for(int i = 1; i<=112; i = i + 3) {
				result = result + i;	
			}
		System.out.println("Sum = " + result);
		}
}
			