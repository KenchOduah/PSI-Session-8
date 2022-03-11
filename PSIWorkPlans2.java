import java.util.Scanner;
/* 1. Create a method that finds the largest value out of 3 values
 * 2. Create a method that finds the smallest value out of 3 values
 * 3. Create a method that calculates the average
 * 4. Create a loop that counts the number of times the same number appears more than once
 */

public class PSIWorkPlans2 {

	public static void main(String[] args) {
		System.out.println(Largest(30, 30, 30));
		System.out.println(Largest(30, 30, 30));
		
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
		
}
