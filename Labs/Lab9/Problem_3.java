import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {


		int[] rnd = new int[100];
		for (int i = 0; i < rnd.length; i++) {
			rnd[i] = (int) (Math.random() * 100);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		try {
			int index = input.nextInt();
			System.out.println("array[" + index + "] = " + rnd[index]);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("INDEX " + ex.getLocalizedMessage() + " is out of bounds");
		} catch (Exception ex) {
			System.out.println("Out of Bounds");
		}
	}
}