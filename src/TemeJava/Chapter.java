package TemeJava;

public class Chapter {

	private String name;
	private Chapter[] subChapter = new Chapter[0];

	public Chapter(String name, Chapter[] subChapter) {
		this.name = name;
		this.subChapter = subChapter;
	}

	public Chapter(String name) {
		this.name = name;

	}

	public void show() {
		System.out.println(name + " " + subChapter);
	}

	public void setSubChapters(Chapter[] subCpt) {
		this.subChapter = subCpt;
	}

	public void display(String prefix) {
		System.out.println(prefix + name);
		// cnt = 0;
		// for (Chapter cpt : subChapter) {
		for (int i = 0; i < subChapter.length; i++) {
			// cnt += 1;
			subChapter[i].display(prefix + (i + 1) + ".");

		}
	}

}
