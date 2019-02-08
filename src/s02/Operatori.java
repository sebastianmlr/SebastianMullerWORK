package s02;

public class Operatori {
	public static void main(String[] args) {
		int n = 7;
		n++;
		System.out.println(n);
		System.out.println(n++); // odata afiseaza apoi incrementeaza
		System.out.println(++n); // incrementeaza apoi afiseaza

		n = 0;
		n = n++ + 5;
		System.out.println(n);

		System.out.println(10 * 3);
		System.out.println(10 / 3.0);
		System.out.println(10 % 3);

		System.out.println(10 - 3);
		System.out.println(10 + 3);
		System.out.println(10 + 3 * 5 - 7);
		System.out.println((10 + 3) * (5 - 7));

		System.out.println(10 << 2); // siftare dreapta sau stanga
		System.out.println(10 >> 2);

		System.out.println(10 >>> 2); // cu 2 de >> muta doar dupa primul bit de semn
		System.out.println(-10 >>> 2); // cu 3 de >>> muta si bitul de semn

		int n5 = 7;
		System.out.println(n5 > 10);
		System.out.println(n5 < 10);
		System.out.println(n5 = 10); // ii da valoarea de 10 si apoi afiseaza
		System.out.println(n5 == 10);
		System.out.println(n5 != 10);

		System.out.println(10 & 5); // operatori logici AND
		System.out.println(10 | 5); // operatori logici OR
		System.out.println(10 ^ 5); // operatori logici

		System.out.println(n > 1 && n5 > 11);
		System.out.println(n > 1 || n5 > 11);
		System.out.println(n > 1 & n5 > 11);
		System.out.println(n > 1 | n5 > 11);

		System.out.println(isNumber(n5) && n > 1);
		System.out.println(n5 > 1 && isNumber(n5));
		System.out.println("eeeee");
		System.out.println(n5 < 1 && isNumber(n5)); // cu 2 de && verifica doar partea din stanga n5 < 1 si restul nu il
													// mai apeleaza isNumber
		System.out.println(n5 < 1 & isNumber(n5)); // cu 1 de & verifica si apeleaza isNumber chiar daca din start este
													// stiut outcome False
		n5 = 7;
		System.out.println(n5 > 4 ? "admis" : "respins"); // un fel de IF direct in linie
		System.out.println(n5 > 4 ? "admis" : "respins");
		System.out.println(n5 > 4 ? (n5 == 10 ? "dd" : "tt") : "respins");
	}

	private static boolean isNumber(int n5) {
		// TODO Auto-generated method stub
		System.out.println("am fost aici");
		return false;
	}
}
