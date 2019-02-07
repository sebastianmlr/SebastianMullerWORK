package s02;

public class PrimitiveExemple {
	public static void main(String[] args) {
		byte b = 100;
		byte b2 = (byte) 200; // cast adica forteaza ce este pus in paranteze
		int n = (int) 13.7;

		char ch = 'A';
		ch++;
		int n2 = ch;

		System.out.println(ch);
		System.out.println(n2);

		char chSpecial = '\\'; // pentru caractere speciale folosim backsplash /

		System.out.println(chSpecial);
		char chSpecial2 = '\'';
		System.out.println(chSpecial2);

		System.out.println("\n\r");
		System.out.println("sdfsdfsd");

	}
}
