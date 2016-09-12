package bookpackext;

class ExtBook extends bookpack.Book
{
	private String publisher;
	public ExtBook(String t, String a, int d, String p)
	{
		super(t,a,d);
		publisher = p;
	}

	public void show()
	{
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	public String getPublisher(){return publisher;}
	public void setPublisher(String p){publisher = p;}

	public String getTitle(){return title;}
	public String getAuthor(){return author;}
	public int getPubDate(){return pubDate;}

	public void setTitle(String t){title = t;}
	public void setAuthor(String a){author = a;}
	public void setPubDate(int d){pubDate = d;}
}