package TemeJava;

public class TestEA3 {
	public static void main(String[] args) {
		System.out.println(isPrime(1));
	}

	public static boolean isPrime(int n) {
		int nrRamas = n - 1;
		while (nrRamas > 1) {
			if (n % nrRamas == 0) {
				return false;
			}
			nrRamas--;
		}
		return n > 1;
	}

}
