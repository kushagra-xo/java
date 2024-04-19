public class rolladie  {
	public static void main(String[] args){
		double randomSeed = Math.random();
		int dieOut = (int) (randomSeed * 6);
		System.out.println(dieOut);
	}
}
