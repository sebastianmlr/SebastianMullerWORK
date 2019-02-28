package TemeJava;

public class TestEA23 {
	public static void main(String[] args) {
		System.out.println(camelCase("ana are mere")); // -> "anaAreMere"
		System.out.println(camelCase(" ANA are MERE"));
		System.out.println(camelCase("ana"));
		System.out.println(camelCase(""));
	}

	public static String camelCase(String input) {
		input = input.trim();
		if (input.equalsIgnoreCase("")) {
			return "";
		}

		String subStr[] = input.split("[ ]+");
		String returnString = "";
		for (int i = 0; i < subStr.length; i++) {
			if (i == 0) {
				returnString += subStr[i].substring(0, 1).toLowerCase() + subStr[i].substring(1).toLowerCase();
			} else {
				returnString += subStr[i].substring(0, 1).toUpperCase() + subStr[i].substring(1).toLowerCase();
			}
		}
		return returnString;
	}
}
