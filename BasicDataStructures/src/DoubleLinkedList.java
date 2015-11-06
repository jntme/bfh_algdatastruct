import java.util.LinkedList;

public class DoubleLinkedList<T> {

	private DoubleNode<T> first = null;
	private DoubleNode<T> last = null;
	private int n = 0;

	/**
	 * Not finished yet.
	 * 
	 * Not tested yet.
	 * 
	 * @param elem
	 */
	public void insertFirst(T elem) {

	}

	/**
	 * Finished.
	 * 
	 * Not tested yet.
	 * 
	 * @param p
	 * @param e
	 * @return
	 */
	public DoubleNode<T> insertAfter(DoubleNode<T> p, T e) {

		DoubleNode<T> q = new DoubleNode<T>(e);
		DoubleNode<T> r = p.next;

		q.prev = q;
		q.next = r;
		p.next = q;

		if (r == null) {
			last = q;
		} else {
			r.prev = q;
		}

		LinkedList<String> list = new LinkedList<>();
		list.add("hallo");
		
		list.indexOf(8);

		
		n++;
		return q;
	}

	/**
	 * Finished.
	 *
	 * Not tested yet.
	 * 
	 * @param p
	 * @return
	 */
	public T removeElement(DoubleNode<T> p) {

		DoubleNode<T> q = p.prev;
		DoubleNode<T> r = p.next;

		if (q != null)
			q.next = r;
		else
			first = r;

		if (r != null)
			r.prev = q;
		else
			last = q;

		n--;
		return p.elem;
	}
}

class DoubleNode<T> {
	DoubleNode<T> prev = null;
	T elem = null;
	DoubleNode<T> next = null;

	public DoubleNode(T elem) {
		this.elem = elem;
	}
}