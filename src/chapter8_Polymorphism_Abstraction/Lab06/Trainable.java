package chapter8_Polymorphism_Abstraction.Lab06;

public interface Trainable {

	void attendTraining(String topic); // = public abstract

	default void feedback() {
		System.out.println("Thanks for the training session.");
	}
}
