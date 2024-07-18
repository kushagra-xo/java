// Casting

/*
* (type) is used to caste a value into a type, this is similar to how things are done in C/C++
*/

public class casting {
	public static void main(String[] args) {
		float input = Float.parseFloat(args[0]);
		System.out.println("float: " + input);
		int integerValue = (int) input;
		System.out.println("integer cast: " + integerValue);
		short shortValue = (short) integerValue;
		System.out.println("short cast: " + shortValue);
		char charValue = (char) shortValue;
		System.out.println("char cast: " + charValue);
	}
}