package CeasDigital;

public class Calculator {
	private double currentValue;

	public double doOperation(String command) {
		char operator = command.charAt(0);

		String ceRamane = command.substring(1);
		double operand = Double.parseDouble(ceRamane);

		switch (operator) {
		case '=':
			currentValue = operand;
			break;
		case '+':
			currentValue += operand;
			break;
		case '-':
			currentValue -= operand;
			break;
		case '*':
			currentValue *= operand;
			break;
		case '/':
			if (operand != 0) {
				currentValue /= operand;
			} else {
				System.out.println("Invalid operation.");
			}

			break;
		default:
			System.out.println("Invalid operation.");
		}

		return currentValue;
	}
}
