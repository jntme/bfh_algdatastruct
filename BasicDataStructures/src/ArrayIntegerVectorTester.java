
public class ArrayIntegerVectorTester {

	public static void main(String[] args) {

		ArrayIntegerVector v = new ArrayIntegerVector(5);
		
		v.elemAtRank(0);
		
		v.insertAtRank(0, 15);
		System.out.println(v);
		v.insertAtRank(0, 18);
		v.insertAtRank(0, 2);
//		v.insertAtRank(0, 77);
		
		
	}

}
