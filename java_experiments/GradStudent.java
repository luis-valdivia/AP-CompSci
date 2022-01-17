public class GradStudent extends Student
{
	private String name;

	public GradStudent(String nm)
	{
		GradStudent.super();
		super(nm, 0, 0, 0, 'm');
	}
	
	public void setName (String nm)
	{
        	name = nm;
	}
	public String getName()
	{
        	return name;
	}
}