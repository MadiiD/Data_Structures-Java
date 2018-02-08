public class SumofNum {

	public static void main(String[] args) {

		int[] A = { 2, -3, 4, -5, 6, 10, -11, 7, 4, 6, -6 };

		int sum = 0;
		for (int i : A) {
			if (i > 0) {
				sum = i + sum;
			}

		}
		System.out.println("Sum of positive array elements is:" + sum);
	}
}
