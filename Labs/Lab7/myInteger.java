class myInteger {
	int numValue;

	myInteger(int num) {
		numValue = num;
	}

	public int getValue() {
		return numValue;
	}

	public static boolean isEven(int n) {
		return (n%2 == 0); 
	}
	public static boolean isOdd(int n) {
		return (!(n%2==0));
	}
	public static boolean isPrime(int n) {
		for (int f = 2; f < n / 2; f++) {
			if(n % f == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(myInteger n) {
		return n.isEven();
	}
	public static boolean isOdd(myInteger n) {
		return n.isOdd(); 
	}
	public boolean isPrime(myInteger n) {
		return n.isPrime();
	}
	public boolean isEven() {
		return isEven(numValue);
	}
	public boolean isOdd() {
		return isOdd(numValue);
	}
	public boolean isPrime() {
		return isPrime(numValue);
	}
	public boolean equals(int n) {
		return (numValue == n);
	}
	public boolean equals(myInteger n) {
		return equals(n.getValue());
	}
	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}
	public static int parseInt(char[] s) {
		return parseInt(new String(s));
	}

}
