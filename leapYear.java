public class leapYear {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		if (year <= 0) {
			System.out.println("Invalid Input: Negative intergers are not allowed");
		} else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
