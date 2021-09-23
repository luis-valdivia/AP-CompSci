public class Remove
{
   public static void main(String[] args)
	{
	String str0 = "the rain in Spain stays mainly on the plain";
	String str1 = str0.replace("s", "");
	String str2 = str1.replace("S", "");
	String str3 = str2.replace("t", "");
	
	System.out.println(str3);
	}
}