import java.util.Scanner;

public class Problem_10_5 {
	private int[] c;
	private int arraysize;

	public static final int defaultarraysize = 16;

	public Problem_10_5() {
		this(defaultarraysize);
	}
	public Problem_10_5(int capacity) {
		c = new int[capacity];
	}
	public int push(int number) {
		if(arraysize >= c.length) {
			int[] b= new int[c.length * 2];
			System.arraycopy(c, 0, b, 0, c.length);
			c=b;
		}
		return c[arraysize++] = number;
	}
	public int pop() {
		return c[arraysize--];
	}
	public int peek() {
		return c[arraysize - 1];
	}
	public boolean empty() {
		return arraysize == 0;
	}
	public int getSize() {
		return arraysize;
	}
}