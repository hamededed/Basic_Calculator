import java.util.Scanner;

public class BasicCalc {
	public static void main(String[]args) {
		float first,second, add,subtract, multiply;
		float divid;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the two numbers : ");
		
		first = scanner.nextFloat();
		second = scanner.nextFloat();
		
		add = first + second;
		subtract = first - second;
		multiply = first * second;
		divid = first / second;
		

		System.out.println("Sum = "+add);
		System.out.println("Subtraction = "+subtract);
		System.out.println("Multiplication = "+multiply);
		System.out.println("Division = "+divid);
		
		
	}

}
