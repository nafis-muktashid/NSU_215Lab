package homeWork_6;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private int year;
	
	//Constructor
	Book(String s1, String s2, String s3, int i){
		this.title = s1;
		this.author = s2;
		this.ISBN = s3;
		this.year = i;
	}
	
	//Get Methods
	public void setTitle(String s) {
		this.title =s;
	}
	public void setAuthor(String s) {
		this.author = s;
	}
	public void setISBN(String s) {
		this.ISBN = s;
	}
	public void setYear(int i) {
		this.year = i;
	}
	
	//Set Methods
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getISBN() {
		return this.ISBN;
	}
	public int getyear() {
		return this.year;
	}
}
