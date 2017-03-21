public class test_4 {

	public static void main(String[] args) {
		
		myString s = new myString(new char[] {'a', 'b', 'c'});
		char[] chars = myString.valueOf(true).toChars();
		for (int i=0; i<chars.length; i++) {
			System.out.print(chars[i]);
		}

	}

}
