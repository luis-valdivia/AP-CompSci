public class Periodical extends Item
{
	private int issue;
	
	public Periodical (String newTitle, int newIssue, String newCopyright)
	{
	super(newTitle, newCopyright);
	issue = newIssue;
	}
	
	public String getListing()
	{
	return "Periodical - Title: " + getTitle() + " Issue: " + issue + " Copyright: " + getCopyright();
	}
}