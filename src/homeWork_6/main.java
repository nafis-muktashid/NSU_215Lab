package homeWork_6;

public class main {

	public static void main(String[] args) {
		Book b = new Book("Java", "Deitel", "921374FJSD2398", 2015);
		
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getISBN());
		System.out.println(b.getyear());

	}

}
