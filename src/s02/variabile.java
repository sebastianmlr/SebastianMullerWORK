package s02;

public class variabile {
	int variabilaMembru; // variabila tip membru
	static int variabilastatica; // daca este cu static inainte se poate accesa din metoda
	static final double CONSTANTA_PI = 3.14; // cu final in fata nu se poate modifica valoarea

	public static void main(String[] args) {
		int variabilalocala = 7;
		System.out.println(variabilalocala);
		System.out.println(variabilastatica);
		// System.out.println(variabilamembru); // variabila membru nestatica nu poate
		// fi accesata printr-o metoda statica

		metoda(variabilalocala);

	}

	private static void metoda(int param) {
		// TODO Auto-generated method stub
		System.out.println(param);

	}
}
