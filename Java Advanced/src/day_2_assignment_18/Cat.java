package day_2_assignment_18;

public class Cat extends Animal implements PetAnimal {
	
	public void actFriendly()
	{
		System.out.println("Cat is acting friendly");
	}
	
	public void play()
	{
		System.out.println("Cat is playing");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Cat is eating");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Cat is sleeping");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("Cat is mewoing");
	}

}
