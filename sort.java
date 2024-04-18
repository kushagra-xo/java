public class sort {
	public static void main(String[] args) {

		int input0 = Integer.parseInt(args[0]);
		int input1 = Integer.parseInt(args[1]);
		int input2 = Integer.parseInt(args[2]);

		// finding the highest number first, then we can deal with the other numbers
		int max01 = Math.max(input0, input1);
		int max12 = Math.max(input1, input2);
		int max = Math.max(max01, max12);

		// now we're left with the two numbers
		int min01 = Math.min(input0, input1);
		int min02 = Math.min(input0, input2);
		int min12 = Math.min(input1, input2);

		// dealing with the minimum
		int min = Math.min(min01, min12);

		// this took me so long to solve ffs but basically
		// we first find the max of the two numbers we're left with
		// and that gives us the middle number.
		int midTemp = Math.max(min01, min02);
		int mid = Math.max(midTemp, min12);

		System.out.println(max);
		System.out.println(mid);
		System.out.println(min);
	}
}
