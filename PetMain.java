import java.util.ArrayList;

public class PetMain
{
	public static void main(String[] args)
	{
	ArrayList<Pet> pets = new ArrayList<Pet>();
	pets.add(new Cat("Stripes"));
	pets.add(new Dog("Fido"));
	pets.add(new LoudDog("Barker"));
	pets.add(new Cat("Fluffy"));
	Kennel k = new Kennel(pets);
	k.allSpeak();
	}
}
	
	
	