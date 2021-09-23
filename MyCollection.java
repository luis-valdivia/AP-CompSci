public class MyCollection
{
	public static void main(String[]args)
	{
	Item[] items = new Item[5];
	items[0] = new Book("Hunter's Oath", "Michelle West", "1937");
	items[1] = new Periodical("Scientific American", 475, "1984");
	items[2] = new Book("Snow Crash", "Neal Stephenson", "2017");
	items[3] = new Book("Harry Potter", "J. K. Rowling", "1999");
	items[4] = new Periodical("People", 96, "2012");
	
	for (int index = 0; index < 5; index++)
	{
	System.out.println(index + " " + items[index].getListing());
	}
	}
}