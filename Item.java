public abstract class Item
{
	private String copyright;
	private String title;
	public abstract String getListing();
	public Item(String newTitle, String newCopyright)
	{
	title = newTitle;
	copyright = newCopyright;
	}
	
	public String getTitle()
	{
	return title;
	}

	public String getCopyright()
	{
	return copyright;
	}
}