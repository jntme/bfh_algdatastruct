import java.util.EmptyStackException;

public class SinglyLinkedListStack<T> {

	SingleLinkNode<T> top = null;
	int n = 0;

	public void push(T object) {
		SingleLinkNode<T> newNode = new SingleLinkNode<T>();

		if (top != null) {
			newNode.next = top;
		}

		newNode.object = object;
		top = newNode;
		n++;
	}

	public T pop() {
		if(n <= 0) {
			throw new EmptyStackException();
		}

		SingleLinkNode<T> returnNode = top;
		top = top.next;
		n--;

		return returnNode.object;
	}

	public int size() {
		return n;
	}

	@SuppressWarnings("hiding")
	private class SingleLinkNode<T> {

		public SingleLinkNode<T> next;
		public T object;
	}
}
