
/**
 * A Vector implemented with an array.
 * 
 * @author seed@bananatreedad.ch
 *
 */
public class ArrayIntegerVector {

	// max containing elements
	private final int N;

	// the actual array
	private Integer[] V;
	private int n = 0;

	public ArrayIntegerVector(int N) {
		V = new Integer[N];
		this.N = N;
	}

	public Integer elemAtRank(int r) {
		return V[r];
	}

	public void insertAtRank(int r, int e) {
		if (r < 0 || r > n)
			throw new ArrayIndexOutOfBoundsException();
		else if (n == N)
			throw new StackOverflowError();
		else {
			if (elemAtRank(r) == null) {
				V[n] = e;
				n++;
			} else {
				for (int i = n; i > r; i--) {
					V[i] = V[i - 1];
				}
				V[r] = e;
				n++;
			}
		}
	}

	public void add(int e) {
		insertAtRank(n, e);
	}

	public int removeAtRank(int r) {
		if (r < 0 || r >= n)
			throw new ArrayIndexOutOfBoundsException();
		else {
			int elem = V[r];
			for (int i = r; i < n-2; i++) {
				V[i] = V[i + 1];
			}
			n--;
			return elem;
		}
	}

	public int size() {
		return n;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public Integer[] getV() {
		return this.V;
	}

}