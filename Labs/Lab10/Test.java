import java.util.Scanner;

public class Test  {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three sides of the Triangle");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.println("Enter the color of the Triangle");
		String color = input.next();

		System.out.println(" Is the Triangle filled? Reply with 'True' or 'False' ");

		String filled = input.next(); 
	}
	{
		new Triangle(side1, side2, side3);

		System.out.println("The Triangle Sides are \n side 1: " + side1 + "\n Side 2: " + side2 + "\n Side 3: " + side3);
		System.out.println("The Triangle's Area is " + (side1 + side2 + side3) / 2);
		System.out.println("The Triangle's Perimeter is "
				+ (side1 + side2 + side3));
		System.out.println("The Triangle's Color is " + getColor;
		System.out.println("Is the Triangle filled? " + isFilled);
	}
}