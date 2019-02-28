package TemeJava;

public class ChapterClient {
	public static void main(String[] args) {
		Chapter cuprins = new Chapter("Cuprins");
		Chapter introducere = new Chapter("Introducere");
		Chapter variabile = new Chapter("Variabile");
		Chapter variabileLocale = new Chapter("Variabile Locale");
		Chapter variabileStatice = new Chapter("variabile Statice");
		Chapter clase = new Chapter("Clase");

		cuprins.setSubChapters(new Chapter[] { introducere, clase });
		introducere.setSubChapters(new Chapter[] { variabile });
		variabile.setSubChapters(new Chapter[] { variabileLocale, variabileStatice });
		// introducere.setSubChapters(new Chapter[] {clase});

		Chapter[] cpt = { cuprins, introducere, variabile, variabileLocale, variabileStatice, clase };
		// showChapters(cpt);
		cuprins.display("");
	}

	// private static void showChapters(Chapter[] Chapter) {
	// for (Chapter emp : Chapter) {
	// emp.show();
	// }
	// }

}
