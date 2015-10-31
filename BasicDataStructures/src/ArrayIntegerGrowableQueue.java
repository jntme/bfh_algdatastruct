import java.util.EmptyStackException;

//TODO fragen: wie array von generic?
//TODO test!
public class ArrayIntegerGrowableQueue {

	private int N = 9;

	private int[] Q = new int[9];

	private int n = 0;
	private int f = 0;

	// runs in O(1) time, EXCEPT when growing
	public void enqueue(int e) {
		if (n == N) {
			int N1 = 2 * N;
			int[] Q1 = new int[N1];

			for (int i = 0; i < n; i++) {
				Q1[i] = Q[f + i % N];
			}
			N = N1;
			Q = Q1;
			f = 0;

			System.out.println("Queue grew to " + N);
		}
		Q[(f + n) % N] = e;
		n++;
	}

	// runs in O(1) time
	public int dequeue() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			int returnValue = Q[f];
			f = (f + 1) % N;
			n--;
			return returnValue;
		}
	}

	// runs in O(1) time
	public int size() {
		return n;
	}

	// runs in O(1) time
	public boolean isEmpty() {
		return n == 0;
	}
}
