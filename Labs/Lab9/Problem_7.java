
public class Problem_7 {


	public static void main(String[] args) {

		System.out.println(bin2Dec("1100100"));
		System.out.println(bin2Dec("abcdefg"));
	}

	public static int bin2Dec(String binary) throws NumberFormatException {

		if (!isBinary(binary)) {
			catch (java.lang.NumberFormatException e){
			throw new NumberFormatException( binary + " is not a binary number.");
			}
		}
		int power = 0;
		int decimal = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {

			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, power);
			}
			power++;
		}
		return decimal;
	}

	public static boolean isBinary(String binary) {

		for (char ch : binary.toCharArray()) {
			if (ch != '1' && ch != '0') return false;
		}
		return true;
	}
}
