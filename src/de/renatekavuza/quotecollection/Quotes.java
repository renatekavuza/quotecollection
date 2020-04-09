package de.renatekavuza.quotecollection;

public class Quotes {

	private String theme;
	private String txt;
	private String author;
	private String religion;

	public Quotes(String theme, String txt, String author, String religion) {
		this.theme = theme;
		this.txt = txt;
		this.author = author;
		this.religion = religion;

		this.Cite();
	}

	public void Cite() {
		System.out.println(theme.toUpperCase() + ":");
		System.out.println(txt);
		System.out.print("By " + author);
		System.out.println(" (" + religion + ")");
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}
}
