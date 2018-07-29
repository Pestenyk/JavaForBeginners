import java.lang.Math;
import java.util.Arrays;

public class Lesson_6 {
	public static void main(String[] args) {

		// Creating and initializing an array of random numbers from -10 to 10 
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = ((int)(Math.random() * 21) - 10);
			System.out.print(numbers[i] + " ");
		}

		int indexOfMax = 0;
		int indexOfMin = 0;
		for (int i = 1; i < numbers.length; i++) {
    			if (numbers[i] > numbers[indexOfMax]) {
        			indexOfMax = i;
    			}
    			else if (numbers[i] < numbers[indexOfMin]) {
        			indexOfMin = i;
    			}
		}

		System.out.println("\n" + "Maximum a[" + indexOfMax + "] = " + numbers[indexOfMax]);
		System.out.println("Minimum a[" + indexOfMin + "] = " + numbers[indexOfMin]);
	}
}