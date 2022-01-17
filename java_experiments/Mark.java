import java.util.Scanner;

public class Mark
{
	public static void main(String[] args)
	{
        	Scanner	reader = new Scanner(System.in);
		String ohr = reader.nextLine();
		System.out.println(isNumeric(ohr));
	}

	public static boolean isNumeric(String str)
	{
	for(int k = 0; k < str.length(); k++){
		String nya = str.substring(k, k + 1);
		if (nya.equals("0")){;}
		else if (nya.equals("1")){;}
		else if (nya.equals("2")){;}
		else if (nya.equals("3")){;}
		else if (nya.equals("4")){;}
		else if (nya.equals("5")){;}
		else if (nya.equals("6")){;}
		else if (nya.equals("7")){;}
		else if (nya.equals("8")){;}
		else if (nya.equals("9")){;}
		else if (nya.equals(".")){;}
		else if (k == 0 && nya.equals("-")){;}
		else{return false;}
	}
	return true;
	}
}