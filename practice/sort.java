public class sort {
	public static void main(String[] args) {

		int input0 = Integer.parseInt(args[0]);
		int input1 = Integer.parseInt(args[1]);
		int input2 = Integer.parseInt(args[2]);

		int max = Math.max(input0, Math.max(input1, input2));
		int min = Math.min(input0, Math.min(input1, input2));

		int min01 = Math.min(input0, input1);
		int min02 = Math.min(input0, input2);
		int min12 = Math.min(input1, input2);

		/*
		 * this took me so long to solve ffs but basically
		 * we first find the max of the two numbers we're left with
		 * and that gives us the middle number.
		 */

		int mid = Math.max(Math.max(min01, min02), min12);

		/*
		 * Another approach that i found interesting was to use the 'sum'
		 * approach where you take the sum of all inputs and subtract
		 * max and min.
		 * mid = input0 + input1 + input2 - min - max
		 */

		System.out.println(max);
		System.out.println(mid);
		System.out.println(min);
	}
}
