import java.util.EmptyStackException;

//TODO fragen: wie array von generic?
//TODO test!
public class ArrayIntegerQueue {

	private int N = 9;

	private int[] Q = new int[9];

	private int n = 0;
	private int f = 0;


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
