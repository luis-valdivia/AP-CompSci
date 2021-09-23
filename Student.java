public class Student
{
    private String name;
    private int test1;
    private int test2;
    private int test3;
    private char gender;
    public Student()
    {
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
	gender = ' ';
    }
    public Student(String nm, int t1, int t2, int t3, char g)
    {
        name = nm;
        test1 = t1;
        test2 = t2;
        test3 = t3;
	gender = g;
    }
    public Student(Student s)
    {
        name = s.name;
        test1 = s.test1;
        test2 = s.test2;
        test3 = s.test3;
        gender = s.gender;
    }
    public void setGender (char g)
    {
	gender = g;
    }
    public char getGender()
    {
	return gender;
    }
    public void setName (String nm)
    {
        name = nm;
    }
    public String getName()
    {
        return name;
    }
    public void setScore (int i, int score)
    {
        if (i == 1) test1 = score;
        else if (i == 2) test2 = score;
        else test3 = score;
    }
    public int getScore (int i)
    {
        if (i == 1) return test1;
        else if (i == 2) return test2;
        else return test3;
    }
    public int getAverage()
    {
        int average;
        average = (int)Math.round((test1+test2+test3)/3.0);
        return average;
    }
    public int getHighScore()
    {
        int highScore;
        highScore = test1;
        if(test2 > highScore) highScore = test2;
        if(test3 > highScore) highScore = test3;
        return highScore;
    }
    public String toString()
    {
        String str;
        str = "Name: " + name + "\n" + "Test 1: " + test1 + " Test 2: " + test2 + " Test 3: " + test3 + " Average: " + getAverage() + " Gender: " + gender;
    return str;
    }
}