package chapter8_Polymorphism_Abstraction.Video79;

public class Video79 {
	public static void main(String[] args) {
		Car car = new Car("Toyota");
		Motorbike motorbike = new Motorbike("Vin");
		Bus bus = new Bus("Honda");

		Vehicle[] vehicles = { car, motorbike, bus };

		for (Vehicle vehicle : vehicles) {
			vehicle.start();
		}
	}
}
