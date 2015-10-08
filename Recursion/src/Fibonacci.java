
public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(6));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(21));
		
		
		System.out.println(fibonacci(50));

	}
	
	private static int fibonacci(int n) {
		if(n <= 1) return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
