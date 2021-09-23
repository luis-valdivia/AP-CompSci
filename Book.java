public class Book extends Item
{
	private String author;
	public Book (String newTitle, String newAuthor, String newCopyright)
	{
	super(newTitle, newCopyright);
	author = newAuthor;
	}

	public String getListing()
	{
	return "Book - Title: " + getTitle() + " Author: " + author + " Copyright: " + getCopyright();
	}
}