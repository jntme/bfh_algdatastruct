import java.util.Stack;

/**
 * @author bananatreedad 
 *
 * @param <T>
 */
public class QueueOutOfStack<T> {

	private Stack<T> in = new Stack<>();
	private Stack<T> out = new Stack<>();
	
	/**
	 * Enqueue.
	 * 
	 * running time:
	 * worst case: O(n)
	 * best case: O(1)
	 * 
	 * @param e
	 */
	public void enqueue(T e) {
		while(!out.isEmpty()) {
			in.push(out.pop());
		}
		in.push(e);
	}
	
	public T dequeue() {
		while(!in.isEmpty()) {
			out.push(in.pop());
		}
		return out.pop();
	}
	
	public T front() {
		while(!in.isEmpty()) {
			out.push(in.pop());
		}
		return out.peek();
	}
	
	public int size() {
		return in.size() + out.size();
	}
	
	public boolean isEmpty() {
		return in.isEmpty() && out.isEmpty();
	}
}
