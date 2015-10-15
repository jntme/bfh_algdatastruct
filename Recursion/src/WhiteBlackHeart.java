public class WhiteBlackHeart {

	public static void main(String[] args) {

		int field[][] = new int[11][11];

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
		floodFill(heartField, 3, 6);
		System.out.println();
		printField(heartField);
	}

	// e.g. floodFill(A, 3, 6, 11, 11)
	public static void floodFill(int a[][], int x, int y) {
		if (a[x][y] == 0) {
			a[x][y] = 1;
			floodFill(a, x - 1, y);
			floodFill(a, x + 1, y);
			floodFill(a, x, y + 1);
			floodFill(a, x, y - 1);
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
