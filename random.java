public class random {
	public static void main(String[] args) {

		double randomSeed1 = Math.random();
		double randomSeed2 = Math.random();
		double randomSeed3 = Math.random();
		double randomSeed4 = Math.random();
		double randomSeed5 = Math.random();

		double avg = (randomSeed1 + randomSeed2 + randomSeed3 + randomSeed4 + randomSeed5) / 5;
		System.out.println("avg: " + avg);

		double min1 = Math.min(randomSeed1, randomSeed2);
		double min2 = Math.min(min1, randomSeed3);
		double min3 = Math.min(min2, randomSeed4);
		double minest = Math.min(min3, randomSeed5);
		System.out.println("min: " + minest);

		double max1 = Math.max(randomSeed1, randomSeed2);
		double max2 = Math.max(max1, randomSeed3);
		double max3 = Math.max(max2, randomSeed4);
		double maxest = Math.max(max3, randomSeed5);
		System.out.println("max: " + maxest);

	}
}
