
public class SinglyLInkedListStackTester {

	public static void main(String[] args) {
		
		SinglyLinkedListStack<String> linkedStack = new SinglyLinkedListStack<>();

		linkedStack.push("Waschlos.");
		linkedStack.push("Nöö.");
		linkedStack.push("OINK");

		
		System.out.println(linkedStack.size());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.size());
		System.out.println(linkedStack.pop());
	}
}
