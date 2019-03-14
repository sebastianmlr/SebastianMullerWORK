package CeasDigital;

public class DisplayVarEnum {
	private final int digitRows = 3;

	public void show(String text) {

		DigitalDisplay dd = DigitalDisplay.D48;
		for (int row = 0; row < digitRows; row++) {
			for (int col = 0; col < text.length(); col++) {
				int ch = text.charAt(col);
				dd = DigitalDisplay.valueOf("D" + ch);
				int nrCharPerLine = dd.getText().length() / digitRows;
				System.out.print(dd.getText().substring(row * nrCharPerLine, row * nrCharPerLine + 3));

			}
			System.out.println();
		}

	}
}
