public class IntegerPrinting {

	public static void main(String[] args) {

		// TODO: why is no higher number printed than 10??
		// printInteger(61, 5);
		printIntegerCompact(610, 15);
	}

	private static void printInteger(int n, int b) {
		if (n < b)
			System.out.println(n);
		else {
			printInteger(n / b, b);
			System.out.println(n % b);
		}
	}

	private static void printIntegerCompact(int n, int b) {
		if (n >= b)
			printIntegerCompact(n / b, b);
		else
			System.out.println(n % b);
	}
}
