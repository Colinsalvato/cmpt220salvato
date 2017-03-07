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