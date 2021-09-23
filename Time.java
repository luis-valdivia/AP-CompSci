public class Time
{
    private int myHrs;
    private int myMins;
    private int mySecs;
    
    public Time()
    {
	myHrs = 0;
	myMins = 0;
	mySecs = 0;
    }
    public Time(int h, int m, int s)
    {
	myHrs = h;
	myMins = m;
	mySecs = s;
    }
    public void resetTime(int h, int m, int s)
    {
	myHrs = h;
	myMins = m;
	mySecs = s;
    }
    public void increment()
    {
	mySecs += 1;
	if(mySecs == 60){
		mySecs = 0;
		myMins += 1;
	}
	if(myMins == 60){
		myMins = 0;
		myHrs += 1;
	}
    }
    public boolean equals(Time t)
    {
        boolean bool = false;
	if (myHrs == t.myHrs && myMins == t.myMins && mySecs == t.mySecs)
		bool = true;
	return bool;
    }
    public boolean lessThan(Time t)
    {
        boolean bool = false;
	if (myHrs < t.myHrs)
		bool = true;
	if (myHrs == t.myHrs && myMins < t.myMins)
		bool = true;
	if (myHrs == t.myHrs && myMins == t.myMins && mySecs < t.mySecs)
		bool = true;
	return bool;
    }
    public String toString()
    {
	String str;
	str = myHrs + ":" + myMins + ":" + mySecs;
	return str;
    }
}