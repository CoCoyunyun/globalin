
public class Ex04 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];

		int n = 20;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n - (4 * j);

			}
			n--;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d\t", arr[i][j]);
			}
			System.out.println();
		}
	}

}
