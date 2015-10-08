
public class Factorial {

	public static void main(String[] args) {
		
		double i = factorial(201);
		System.out.println(i);

		System.out.println(factorial(1));
	}
	
	private static int factorial(int n) {
		
		System.out.println("Factorial called! n: " + n);
		if(n == 1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

}
