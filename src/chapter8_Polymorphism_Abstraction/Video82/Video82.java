package chapter8_Polymorphism_Abstraction.Video82;

public class Video82 {
	public static void main(String[] args) {
		Plane myPlane = new Plane();
		Bird myBird = new Bird();

		myPlane.doFly();
		myBird.doFly();
		myBird.makeSound();
	}
}
