import java.util.Scanner;
public class Problem_9_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] m = new double[row][column];

		System.out.println("Enter the array:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}

		}
		Problem_9_16 location = Location.locateLargest(m);

		System.out.println("The location of the largest element is "
				+ location.maxValue + " at (" + location.row + ", " + location.column + ")");
	}
	public static int[] locateLargest(double[][] a) {
		int[] location = new int[] { 0, 0 };
		double largest = a[0][0];
		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {

				if (a[i][k] > largest) {
					location[0] = i;
					location[1] = k;
					largest = a[i][k];
				}

			}
		}

		return location;
	}
}