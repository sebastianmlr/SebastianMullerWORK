package TemeJava;

//hangman("collections", "eio") -> "_o__e__io__"

public class TestEA21 {
	public static void main(String[] args) {
		System.out.println(hangman("collections", "eIO"));
		System.out.println(hangman("Java is BAD", "bad"));
		System.out.println(hangman("", "abc"));
		System.out.println(hangman("abc", ""));
		System.out.println(hangman("coll,ections", "eio"));
	}

	public static String hangman(String word, String letters) {
		String returnString = "";
		for (int i = 0; i < word.toCharArray().length; i++) {

			if (word.charAt(i) == ' ') {
				returnString += " ";
				continue;
			}
			if (word.matches("^[a-z A-Z]*$") == false) {
				return null;
			}

			boolean chk = false;
			for (char elemDinLetter : letters.toLowerCase().toCharArray()) {
				if (word.toLowerCase().charAt(i) == elemDinLetter) {
					returnString += word.charAt(i);
					chk = true;
				}
			}
			if (chk == false) {
				returnString += "_";
			}
		}
		return returnString;
	}

}
