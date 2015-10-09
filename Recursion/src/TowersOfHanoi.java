import java.util.Stack;

public class TowersOfHanoi {

	public static void main(String[] args) {
		hanoi(6);

	}

	/**
	 * Output: print sequence of instructions on screen
	 * 
	 * @param n
	 *            = number of blocks
	 */
	public static void hanoi(int n) {
		if (n > 0) {
			// init the three stacks
			Stack<Integer> s1 = new Stack<Integer>();
			Stack<Integer> s2 = new Stack<Integer>();
			Stack<Integer> s3 = new Stack<Integer>();

			// add initial n's to first stack
			for (int i = 1; i <= n; i++) {
				s1.push(i);
			}
			
			solveHanoi(s1, s2, s3, n);
			System.out.println(s3);
		}
	}

	public static void solveHanoi(Stack<Integer> s1, Stack<Integer> s2,
			Stack<Integer> s3, int n) {

		if (n == 1) {
			//actual move
			s3.push(s1.pop());
			//TODO print number of s1 => s3
		}

		else {
			//we move the whole stack to the 'reserve' stack
			solveHanoi(s1, s3, s2, n-1);
			//move the biggest to stack 3
			solveHanoi(s1, s2, s3, 1);
			//move rest of the stack to stack 3
			solveHanoi(s2, s1, s3, n-1);
		}

	}

}
