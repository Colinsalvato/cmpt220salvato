import java.util.ArrayList;
import java.util.Scanner;

public class Problem_17{

	public static void main(String[] args) {
		System.out.print("Enter an integer x: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		ArrayList factors = new ArrayList<>();

		getFactors(x, factors);

		int smallestSquare = smallestSquare(factors);
		System.out.println("The smallest number n for x * y to be a perfect square is " + smallestSquare);
		System.out.println("x * y = " + (x * smallestSquare));
	}

	private static int smallestSquare(ArrayList <Integer> factors) {

		int[][] occurrences = copy(factors);
		for (int i : factors){
			search(occurrences, i);
		}

		ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

		int smallestSquare = 1;
		for (int i : oddSequenceFactors){
			smallestSquare *= i;
		}
		return smallestSquare;
	}

	private static ArrayList removeDuplicates(int[][] x) {
		ArrayList temp = new ArrayList<>();

		for (int i = 0; i < x.length; i++){
			if (x[i][1] % 2 != 0) {
				temp.add(x[i][0]);
			}
		}

		ArrayList<Integer> duplicateRemoved = new ArrayList<>();
		for (int i = 0; i < temp.size(); i++) {

			if (!duplicateRemoved.contains(temp.get(i))) {
				duplicateRemoved.add((Integer) temp.get(i));
			}
		}

		return duplicateRemoved;
	}

	private static void search(int[][] x, int number) {
		for (int i = 0; i < x.length; i++) {
			if (x[i][0] == number) {
				x[i][1]++;
			}
		}
	}

	private static int[][] copy(ArrayList<Integer> factors) {

		int[][] temp = new int[factors.size()][2];

		for (int i = 0; i < temp.length; i++) {
			temp[i][0] = factors.get(i);
		}
		return temp;
	}

	private static void getFactors(int x, ArrayList factors) {

		int count = 2;
		while (count <= x) {
			if (x % count == 0) {
				factors.add(count);
				x /= count;
			} else {
				count++;
			}
		}
	}
}