public class TestStudent
{
    public static void main (String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Bill", 84, 86, 88, 'M');
        Student s3 = new Student(s2);
        Student s4;
        System.out.println("\nHere is student s1\n" + s1);
        System.out.println("\nHere is student s2\n" + s2);
        System.out.println("\nHere is student s3\n" + s3);
 
        s3.setName("Jill");
        s3.setScore(1, 84);
        s3.setScore(2, 86);
        s3.setScore(3, 88);
	s3.setGender('F');
        System.out.println("\nHere is student s3\n" + s3);
        
        s4 = s3;
        System.out.println("\nHere is student s4\n" + s4);
 
        boolean same = s2.equals(s3);
        System.out.println(same);
    
        s1.setName("Sam");
        System.out.println("\nName of s1 is now: " + s1.getName());
    }
}