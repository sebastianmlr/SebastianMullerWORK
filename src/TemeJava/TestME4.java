package TemeJava;

public class TestME4 {
	public static void main(String[] args) {
		System.out.println(evaluate("5-2-1"));
	}

	public static int evaluate(String expression) {
		// TODO Auto-generated method stub
		expression = expression.replaceAll(" ", "");
		String reg = "((?<=[<=|>=|==|\\+|\\*|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\-|<|>|/|=]))";

		String[] sSplited = expression.split(reg);
		// System.out.println(Arrays.toString(sSplited));

		for (int i = 1; i < sSplited.length; i = i + 2) {
			if (sSplited[i].contentEquals("*")) {
				sSplited[i + 1] = Integer
						.toString(Integer.parseInt(sSplited[i - 1]) * Integer.parseInt(sSplited[i + 1]));
				sSplited[i - 1] = "Y";
				sSplited[i] = "Y";
			}
			if (sSplited[i].contentEquals("/")) {
				sSplited[i + 1] = Integer
						.toString(Integer.parseInt(sSplited[i - 1]) / Integer.parseInt(sSplited[i + 1]));
				sSplited[i - 1] = "Y";
				sSplited[i] = "Y";
			}
		}
		// System.out.println(Arrays.toString(sSplited));
		// System.out.println();

		int rezultat = nextValNoY(sSplited, 0);

		for (int j = 1; j < sSplited.length; j = j + 2) {
			if (sSplited[j].contentEquals("+")) {
				rezultat += nextValNoY(sSplited, j + 1);
			} else if (sSplited[j].contentEquals("-")) {
				rezultat -= nextValNoY(sSplited, j + 1);
			}
		}
		// System.out.println(Arrays.toString(sSplited));

		return rezultat;
	}

	public static int nextValNoY(String[] sSplited, int stratFrom) {
		// TODO Auto-generated method stub
		for (int i = stratFrom; i < sSplited.length; i++) {
			if (!(sSplited[i].contentEquals("Y"))) {
				return Integer.parseInt(sSplited[i]);
			}
		}
		return 0;
	}

}
