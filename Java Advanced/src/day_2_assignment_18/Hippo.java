package day_2_assignment_18;

public class Hippo extends Animal {
	
	public void swim()
	{
		System.out.println("Hippo is swimming");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Hippo is eating");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Hippo is sleeping");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("Hippo is makinig noise");
	}

}
