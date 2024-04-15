public class polySqrt {
	public static void main(String[] args) {
		// cofficients of the polynomial
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		double descriminant = b * b - 4.0 * a * c;

		// using the quadratic formula
		double root1 = (-b + Math.sqrt(descriminant)) / 2 * a;
		double root2 = (-b - Math.sqrt(descriminant)) / 2 * a;

		System.out.println(root1);
		System.out.println(root2);
	}
}
