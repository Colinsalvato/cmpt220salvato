class myString {
	private char[] chars;
	public myString(char[] chars) {
		this.chars = new char[chars.length];
		System.arraycopy(chars, 0, this.chars, 0, chars.length);
	}
	public int compare(myString s) {
		return 1;
	}
	public myString toUppercase() {
		char[] temp = new char[chars.length];
		for (int i=0; i < chars.length; i++) {
			temp[i] = Character.toUpperCase(chars[i]);	
		}
		return new myString(temp);
	}
	public static myString valueOf(boolean k) {
		if(k) 
			return new myString(new char[] {'T', 'R', 'U', 'R'});
		else
			return new myString(new char[] {'F', 'A', 'L', 'S', 'E'});
	}
	public myString substring(int x) {
		char[]  temp = new char[chars.length - x];
		for (int i = x; i < chars.length; i++) {
			temp[i - x] = chars[i];
		}
		return new myString(temp);
	}
	public char[] toChars() {
		return chars;
	}
}
