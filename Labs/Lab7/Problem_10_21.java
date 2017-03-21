import java.math.BigInteger;

public class Problem_10_21 {

	public static void main(String[] args) {

		BigInteger longValue = new
				BigInteger(Long.MAX_VALUE+"");
		int x = 1;
		longValue = longValue.add(new BigInteger("1"));
		System.out.println("The first ten numbers greater than Long.MAX_VALUE and divisible by 5 or 6 are ");
		while (x <= 10) {
			if (longValue.remainder(new BigInteger("5"))
					.equals(BigInteger.ZERO) || longValue
					.remainder(new BigInteger("6"))
					.equals(BigInteger.ZERO)) {
				System.out.println(longValue);
				x++;
			}
			longValue = longValue.add(new BigInteger("1"));
		}
	}
}
