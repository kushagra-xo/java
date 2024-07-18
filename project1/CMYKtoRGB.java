public class CMYKtoRGB {
	public static void main(String[] args) {

		double cyan = Double.parseDouble(args[0]);
		double magenta = Double.parseDouble(args[1]);
		double yellow = Double.parseDouble(args[2]);
		double black = Double.parseDouble(args[3]);

		double white = 1 - black;
		int red = (int) Math.round(255 * (1 - cyan) * white);
		int green = (int) Math.round(255 * (1 - magenta) * white);
		int blue = (int) Math.round(255 * (1 - yellow) * white);

		System.out.println("red   = " + red);
		System.out.println("green = " + green);
		System.out.println("blue  = " + blue);
	}
}
