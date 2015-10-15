public class WhiteBlackHeart {

	public static void main(String[] args) {

		int heartField[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		printField(heartField);
		floodFill(heartField, 1, 1, 11, 11);
		System.out.println();
		printField(heartField);
	}

	// e.g. floodFill(A, 3, 6, 11, 11)
	public static void floodFill(int a[][], int x, int y, int n, int m) {
		if (x >= 0 && x < n && y >= 0 && y < m) {
			if (a[x][y] == 0) {
				a[x][y] = 1;
				floodFill(a, x - 1, y, n, m);
				floodFill(a, x + 1, y, n, m);
				floodFill(a, x, y + 1, n, m);
				floodFill(a, x, y - 1, n, m);
			}
		}
	}

	/**
	 * Prints the field.
	 * 
	 * @param heartField
	 */
	public static void printField(int heartField[][]) {
		for (int i = 0; i < heartField.length; i++) {
			for (int j = 0; j < heartField[i].length; j++) {
				if (heartField[i][j] != 0)
					System.out.print("O ");
				else
					System.out.print(". ");
			}
			System.out.print("\n");
		}
	}
}
