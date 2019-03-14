package CeasDigital;

public enum DigitalDisplay {
	D46("       o "), // .
	D48(" _ | ||_|"), // 0
	D49("     |  |"), // 1
	D50(" _  _||_ "), // 2
	D51(" _  _| _|"), // 3
	D52("   |_   |"), // 4
	D53(" _ |_  _|"), // 5
	D54("   |_ |_|"), // 6
	D55(" _   |  |"), // 7
	D56(" _ |_||_|"), // 8
	D57(" _ |_|  |"), // 9
	D58("    o  o "), // :
	D45("    _    "), // -
	D69(" _ |_ |_ "),; // E

	private String text;

	DigitalDisplay(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
