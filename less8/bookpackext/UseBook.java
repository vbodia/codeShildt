package bookpackext;

class UseBook
{
	public static void main(String args [])
	{
		bookpack.Book books[] = new bookpack.Book[5];

		books[0] = new bookpack.Book("Java: A beginner's Guide", "Shildt", 2011);
		books[1] = new bookpack.Book("Java: The Compleate Reference", "Shildt", 2011);
		books[2] = new bookpack.Book("The Art of Java", "Shildt and Holmes", 2003);
		books[3] = new bookpack.Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new bookpack.Book("On the Road", "Kerouac", 1955);
		for(int i = 0; i<books.length; i++)
			books[i].show();
	}
}