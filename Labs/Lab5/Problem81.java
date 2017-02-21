import java.util.Scanner;

public class Problem81 {

	public static void main(String[] args) {
		System.out.print("Enter a 3 by 4 matrix: ");
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[3][4];
		for (int i = 0; i < matrix.length; i++)
			for (int h = 0; h < matrix[i].length; h++){
				matrix[i][h] = input.nextDouble();
			}
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("The sum of the doubles in column " + i +" is " + sumColumn(matrix, i));
		}

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;

		for (int i = 0; i < m.length; i++) {
			total += m[i][columnIndex];
		}
		return total;
	}

	public static void Matrix(double[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				System.out.printf("%5.0f ", matrix[row][column]);
			}
		}
	}

}
