package chapter8_Polymorphism_Abstraction.Video79;

public class Bus extends Vehicle {
	public Bus(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Bus " + super.getBrand() + " is staring with air brakes");
	}
}
