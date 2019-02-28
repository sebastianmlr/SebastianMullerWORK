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

	public void display(String prefix, int cnt) {
		System.out.println(prefix + name);
		for (Chapter cpt : subChapter) {
			cnt += 1;
			cpt.display(prefix + cnt + ".", cnt);

		}
	}

}
