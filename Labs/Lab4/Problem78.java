import java.util.Scanner;

public class Problem78 {
static final int SIZE = 10;
	public static void main(String[] args) {
		double[] numbers = new double[SIZE];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 double numbers: ");
        for (int j = 0; j < numbers.length; j++) numbers[j] = input.nextDouble();

        System.out.println("The average value is: " + average(numbers));

    }

    public static int average(int[] array) {
        int tot = 0;
        for (int i = 0; i < array.length; i++) {
            tot += array[i];
        }
        return tot / array.length;
    }

    public static double average(double[] array) {
        double tot = 0;
        for (int i = 0; i < array.length; i++) {
            tot += array[i];
        }
        return tot / array.length;
    }

    public static void printArray(int[] array, int numberPerLine) {

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%4d", array[i]);
            if ((i + 1) % numberPerLine == 0) System.out.println("");
        }
    }

	}


