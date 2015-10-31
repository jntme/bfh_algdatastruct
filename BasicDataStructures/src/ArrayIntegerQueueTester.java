
public class ArrayIntegerQueueTester {

	public static void main(String[] args) { 
		ArrayIntegerGrowableQueue queue = new ArrayIntegerGrowableQueue();
		
		for (int i = 0; i < 10000; i++) {
			queue.enqueue(i);
		}
		
		System.out.println("Size of GrowableQueue: " + queue.size());
	}
}
