public class RightTriangle {
	public static void main(String[] args) {

		int side0 = Integer.parseInt(args[0]);
		int side1 = Integer.parseInt(args[1]);
		int side2 = Integer.parseInt(args[2]);

		boolean check1 = (side0 * side0) == (side1 * side1) + (side2 * side2);
		boolean check2 = (side1 * side1) == (side0 * side0) + (side2 * side2);
		boolean check3 = (side2 * side2) == (side1 * side1) + (side0 * side0);

		System.out.println((check1 || check2 || check3) && side0 > 0 && side1 > 0 && side2 > 0);

	}
}
