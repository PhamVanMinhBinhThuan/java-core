package chapter8_Polymorphism_Abstraction.Video82;

public class Bird implements Flyable, Animal { // Co the co nhieu interface khong nhu extends chi co 1

	@Override
	public void doFly() {
		System.out.println("The bird is flying .......");
	}

	@Override
	public void makeSound() {
		System.out.println("Sound's Bird ...");
	}
}
