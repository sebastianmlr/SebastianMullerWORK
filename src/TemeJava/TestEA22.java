package TemeJava;

public class TestEA22 {
	public static void main(String[] args) {
		System.out.println(stringSum(""));
	}

	public static int stringSum(String input) {
		if (input.equalsIgnoreCase("")) {
			return 0;
		}
		input = input.replaceAll(" ", "");
		int suma = 0;
		String numere[] = input.split("[,]+");
		for (String nr : numere) {
			suma += Integer.parseInt(nr);
		}
		return suma;
	}

}
