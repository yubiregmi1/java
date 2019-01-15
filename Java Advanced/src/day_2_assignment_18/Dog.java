package day_2_assignment_18;

public class Dog extends Animal implements PetAnimal{
	
	public void actFriendly()
	{
		System.out.println("Dog is acting friendly");
	}
	
	public void play()
	{
		System.out.println("Dog is playing");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Dog is eating");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("Dog is barking");
	}

}
