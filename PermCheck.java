import java.util.Scanner;

public class PermCheck {

	public static void main(String[] args) {
		// Initialization of the values and Scanner
		double num1 = 0;
		double num2 = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter the length of the class size: ");
			num1 = input.nextDouble();
			System.out.println("Enter to width of the class size: ");
			num2 = input.nextDouble();
			// Do Stuff!
			while (num1 != 0 && num2 != 0) {
				double perimeter = num1 * num2;
				double area = num1 + num1 + num2 + num2;
				
				System.out.println("The perimeter of the class is: " + perimeter);
				System.out.println("The area of the class is: " + area);
				num1 = 0;
				num2 = 0;
				// Blank space to allow the Scanner to continue working properly
				String nullSpace = input.nextLine();
			}
			System.out.println("Would you like to continue? Type Y to continue.");
			// Kudos to StackOverflow for the following while loop structure.
		} while (input.next().equalsIgnoreCase("Y"));
		// Anything other than a Y closes the program.
		System.out.println("Exiting program...");
		input.close();
	}
}