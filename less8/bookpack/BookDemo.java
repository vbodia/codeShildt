package bookpack;

public class Book
{
	private String title;
	private String author;
	private int pubDate;

	public Book(String t, String a, int d)
	{
		title = t;
		author = a;
		pubDate = d;
	}

	public void show()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}

class BookDemo
{
	public static void main(String args[])
	{
		Book books [] = new Book[5];

		books[0] = new Book("Java: A beginner's Guide", "Shildt", 2011);
		books[1] = new Book("Java: The Compleate Reference", "Shildt", 2011);
		books[2] = new Book("The Art of Java", "Shildt and Holmes", 2003);
		books[3] = new Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new Book("On the Road", "Kerouac", 1955);
		for(int i = 0; i<books.length; i++)
			books[i].show();
	}
}