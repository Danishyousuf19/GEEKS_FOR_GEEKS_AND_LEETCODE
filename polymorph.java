class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class cat extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends s implements ss{
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}

	@Override
	void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void s() {
		// TODO Auto-generated method stub
		
	}
}
abstract class s{
	abstract void f();
}
interface ss{
	public void s();
}
public class polymorph {

	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myPig = new Animal(); // Create a Pig object
		ss myDog = new Dog(); // Create a Dog object
		myAnimal.animalSound();
		myPig.animalSound();
//		myDog.animalSound();
	}
}
