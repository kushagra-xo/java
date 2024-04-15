public class replace {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); // declaration
		int b = Integer.parseInt(args[1]);
		int t = 0;
		t = a;
		a = b;
		b = t;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
