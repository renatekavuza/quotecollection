
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

	public String gettheme() {
		return theme;
	}

	public void settheme(String theme) {
		this.theme = theme;
	}

	public String getxt() {
		return txt;
	}

	public void settxt(String txt) {
		this.txt = txt;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	public String getreligion() {
		return religion;
	}

	public void setreligion(String religion) {
		this.religion = religion;
	}
	

}

