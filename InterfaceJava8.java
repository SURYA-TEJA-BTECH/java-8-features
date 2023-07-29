package in.surya;

interface PetAnimals {

	public abstract void eat();

	public default void sleep() {
		System.out.println(" All pet animals  will  sleep....");

	}

}

class Dog implements PetAnimals {

	public void eat() {
		System.out.println("dog is eating ");

	}

	
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(" i am a dog and i   will  sleep....");

	}

}

class Cat implements PetAnimals {

	public void eat() {
		System.out.println("cat is eating ");

	}

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(" i am a cat and i   will  sleep....");

	}

}

class Action {

	public static void display(PetAnimals petAnimals) {
		petAnimals.eat();
		petAnimals.sleep();

	}
}

public class InterfaceJava8 {
	public static void main(String[] args) {

		PetAnimals dog = new Dog();
		PetAnimals cat = new Cat();

		Action.display(cat);
		Action.display(dog);
		//PetAnimals.sleep();
	}
}
