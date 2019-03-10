package TemeJava;

//nthSmallest({6,8,2,1,4,9}, 3) -> 4
//nthSmallest({6,8,2,0,4,9}, 2) -> 2
//nthSmallest({6,8,2,1,4,9}, 6) -> 9
//nthSmallest({6,8,2,1,4,9}, 7) -> -1
//nthSmallest({6,8,2,0,4,9}, 1) -> 0
public class TestEA7Recursiv {
	public static void main(String[] args) {
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 3));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 0, 4, 9 }, 2));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 0, 4, 9 }, 1));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 6));
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 7));

	}

	public static int nthSmallest(int[] sir, int n) {
		if (sir.length == 1) {
			return sir[0];
		}
		if (n > sir.length) {
			return -1;
		}
		int smallestNrFound = 0;
		int[] sirnou = new int[sir.length];
		sirnou[sir.length - 1] = sir[0];
		for (int i = 1; i < sir.length; i++) {
			sirnou[i - 1] = sir[i];
			if (sir[0] < sir[i]) {
				smallestNrFound++;
			}
		}
		if (smallestNrFound == sir.length - n) {
			return sir[0];
		} else {
			return nthSmallest(sirnou, n);
		}
	}

}
