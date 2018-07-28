import java.util.Scanner;

public class Lesson_4 {
	public static void main(String[] args) {
		
		// Зчитую перше число
		System.out.println("Введіть перше число");
		int num1 = readNum();
		
		// Зчитую друге число
		System.out.println("Введіть друге число");
		int num2 = readNum();

		/* Перевірка на найбільше число і відповідно до отриманого 
		результату виконую арифметичну операцію над ним та виводжу результат */
		if(num1>num2) {
			int result = num1 - num2;
			System.out.println("Ваш результат: " + result);
		} else {
			int result = num1 + num2;
			System.out.println("Ваш результат: " + result);
		}
						
	}	
		
	// Створюю метод для зчитування числа з консолі
	public static int readNum() {

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
}