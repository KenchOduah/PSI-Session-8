import java.util.Scanner;
/*Create a methods that takes two user input and returns the two numbers 
 * multiplied, added, subtracted, and divided
*/

public class PSIWorkPlans {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: (can be decimals) ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		System.out.println(Addition(num1, num2));
		System.out.println(Subtraction(num1, num2));
		System.out.println(Multiplication(num1, num2));
		System.out.println(Division(num1, num2));

	}
	public static double Addition(double num1, double num2){
		return num1 + num2;
	}
	public static double Subtraction(double num1, double num2) {
		return num1 - num2;
	}
	public static double Multiplication(double num1, double num2) {
		return num1 * num2;
	}
	public static double Division(double num1, double num2) {
		return num1 / num2;
	}
}
