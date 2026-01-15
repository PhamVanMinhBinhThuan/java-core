package chapter8_Polymorphism_Abstraction.Video77;

public class Video77 {
	public static void main(String[] args) {
//		Animal animal = new Animal();	// OK
//		Dog dog = new Dog();			// OK

//		Dog test1 = new Animal();	// Error

		Animal test1 = new Dog(); // upcasting

		System.out.println(test1.getClass());
		test1.makeSound();
//		test1.wagTail();	// Can't Call

		if (test1 instanceof Dog) {
			Dog test2 = (Dog) test1; // downcasting
			test2.wagTail();
		}
	}
}
