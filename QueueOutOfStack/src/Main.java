
public class Main {

	public static void main(String[] args) {

		QueueOutOfStack<String> stringQueue = new QueueOutOfStack<>();

		stringQueue.enqueue("1");
		stringQueue.enqueue("2");
		stringQueue.enqueue("3");
		stringQueue.enqueue("4");
		
		System.out.println("size of stack: " + stringQueue.size());

		System.out.println(stringQueue.dequeue());
		System.out.println(stringQueue.dequeue());
		System.out.println(stringQueue.dequeue());
		System.out.println(stringQueue.dequeue());
		// empty stack exception
		// System.out.println(stringQueue.dequeue());
		
		System.out.println(stringQueue.isEmpty());
		
	}

}
