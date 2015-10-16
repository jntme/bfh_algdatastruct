import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

public class DataStructuresTest {

	public static void main(String[] args) {

		// Stack
		Stack<String> stack = new Stack<>();
		stack.push("John");
		stack.push("Jenny");
		stack.push("Jacky");
		stack.push("Jimmy");
		System.out.println("Stack:");
		System.out.println(stack);

		// Queue
		Queue<String> queue = new LinkedBlockingQueue<>();

		// Vector == ArrayList(is not thread safe)
		Vector<String> vector = new Vector<>();
		vector.addElement("John");
		vector.addElement("Jenny");
		vector.addElement("Jacky");
		vector.addElement("Jimmy");
		System.out.println("Vector:");
		System.out.println(vector);

		// Array

		// List
		List<String> list = new LinkedList();
		list.add("John");
		list.add("Jenny");
		list.add("Jacky");
		list.add("Jimmy");
		System.out.println("List:");
		System.out.println(list);

		// Stream
		int i = IntStream.range(1, 100).filter(x -> {
			if (x % 2 == 0)
				return true;
			return false;
		}).map(x -> {
			return x ^ 2;
		}).limit(5).sum();
		System.out.println("Stream calculated int:");
		System.out.println(i);


	}
}
