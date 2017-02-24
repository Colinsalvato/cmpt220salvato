// JA: Always add comments to your code
public class Problem810 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];

		int largestRow = 0;
		int largest = -1;
		for (int i = 0; i < matrix.length; i++) {
			int rowCount = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2); // 0 and 1
				rowCount += matrix[i][j];
			}
			if (rowCount > largest) {
				largestRow = i;
				largest = rowCount;
			}
		}

		int largestColumn = 0;
		largest = -1;
		for (int k = 0; k < matrix[0].length; k++) {
			int columnCount = 0;
			for (int l = 0; l < matrix.length; l++) {
				columnCount += matrix[l][k];
			}
			if (columnCount > largest) {
				largest = columnCount;
				largestColumn = k;
			}
		}
		// JA: The matrix does not print right
		for (int m = 0; m < matrix.length; m++) {
			for (int n = 0; n < matrix[m].length; n++) {
				System.out.printf("%d", matrix[m][n]);
			}
		}
		System.out.println("The largest row index: " + largestRow);
		System.out.println("The larges column index: " + largestColumn);

	}

}
