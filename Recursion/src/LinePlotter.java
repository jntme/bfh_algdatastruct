public class LinePlotter {

	public static void main(String[] args) {
		plotLine(8, 5, 21, 11);
	}

	private static void plotLine(int x1, int y1, int x2, int y2) {
		if (Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1) {
			plotPixel(x1, y1);
			plotPixel(x2, y2);
		} else {
			int x = (x1 + x2) / 2;
			int y = (y2 + y1) / 2;
			plotLine(x1, y1, x, y);
			plotLine(x2, y2, x, y);
		}
	}

	private static void plotPixel(int x, int y) {
		System.out.println("(" + x + "," + y + ")");
	}
}
