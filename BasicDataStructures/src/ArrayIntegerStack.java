import java.util.EmptyStackException;

public class ArrayIntegerStack {
	//max size of array
	private static final int N = 8;
	
	int[] A = new int[N];
	
	//number of elements in array
	int n = 0;

	// runs in O(1) time
	public void push(int e) {
		if(n < N) {
			A[n] = e;
			n++;
		}
		else {
			throw new StackOverflowError();
		}
	}
	
	// runs in O(1) time
	public int pop() {
		if(n>0) {
			n--;
			return A[n];
		}
		else {
			throw new EmptyStackException();
		}
	}
	
	// runs in O(1) time
	public int top() {
		if(n > 0) {
			return A[n-1];
		}
		else {
			throw new EmptyStackException();
		}
	}
	
	// runs in O(1) time
	public int size() {
		return this.n;
	}
	
	// runs in O(1) time
	public boolean isEmpty() {
		return n == 0;
	}
}
