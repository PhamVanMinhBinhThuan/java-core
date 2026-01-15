package chapter8_Polymorphism_Abstraction.Video79;

public class Motorbike extends Vehicle {
	public Motorbike(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Motorbike " + super.getBrand() + " is kick-starting");
	}
}
