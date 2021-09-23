public class TestTime
{
    public static void main (String[] args)
    {
	Time t1 = new Time();
	Time t2 = new Time(4, 2, 0);
	System.out.println("First time is " + t1.toString());
	System.out.println("Second time is " + t2.toString());

	t1.resetTime(4,2,0);
	System.out.println("First time reseted is " + t1.toString());
	System.out.println("Are the times equal? " + t1.equals(t2));

	t2.increment();
	System.out.println("Incremented second time is " + t2.toString());
	System.out.println("First time less than second? " + t1.lessThan(t2));
    }
}