import java.util.Scanner;
/* 1. Create a method that finds the largest value out of 3 values
 * 2. Create a method that finds the smallest value out of 3 values
 * 3. Create a method that calculates the average
 * 4. Create a loop that counts the number of times the same number appears more than once
 * 5. Create a method that determines if an number entered is even or odd
 * 6. Create a method that determines if a number entered is a multiple of 2 or 5
 * 7. Create a loop that displays the lowest grade and highest from the 10 grades entered
 */

public class PSIWorkPlans2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*System.out.println(Largest(30, 30, 30));
		System.out.println(Largest(30, 30, 30));
		System.out.print(EvenOdd(11));*/
		
		int grade = 0;
		int highest = 0;
		int lowest = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter grade " + i + ":");
			grade = input.nextInt();
			if (grade > highest) {
				highest = grade;
			}
			if (grade < lowest) {
				lowest = grade;
			}
		}
		System.out.println("Highest Grade is: "+ highest);
		System.out.println("Lowest Grade is: "+ lowest);
		
	}
	public static int Largest(int num1, int num2, int num3) {
		if ((num1 > num2) && (num1 > num3)) {
			return num1;
		}
		else if ((num2 > num1) && (num2 > num3)) {
			return num2;
		}
		else {
			return num3;
		}
	}
	
	public static int Smallest(int num1, int num2, int num3) {
		if ((num1 < num2) && (num1 < num3)) {
			return num1;
		}
		else if ((num2 < num1) && (num2 < num3)) {
			return num2;
		}
		else {
			return num3;
		}
	}
	public static String EvenOdd(int num1) {
		if (num1 % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
		
}
