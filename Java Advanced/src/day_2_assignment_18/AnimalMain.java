package day_2_assignment_18;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat1 = new Cat();
		Animal dog1 = new Dog();
		Animal hippo1 = new Hippo();
		
		//call cat methods
		cat1.eat();
		cat1.sleep();
		cat1.makeNoise();
		((Cat) cat1).actFriendly();
		((Cat) cat1).play();
		
		//call dog methods
		dog1.eat();
		dog1.sleep();
		dog1.makeNoise();
		((Dog) dog1).actFriendly();
		((Dog) dog1).play();
		
		//call hippo methods
		hippo1.eat();
		hippo1.sleep();
		hippo1.makeNoise();
		

	}

}
