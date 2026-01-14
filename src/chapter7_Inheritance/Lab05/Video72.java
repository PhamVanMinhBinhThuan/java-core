package chapter7_Inheritance.Lab05;

public class Video72 {
	public static void main(String[] args) {
		Manager manager = new Manager("IT", "M001", 10000, "Pham Pham", 19);

		manager.introduce();
		System.out.println();
		System.out.println("Basic salary: " + manager.calculateSalary());
		System.out.println("Basic after bonus: " + manager.calculateSalary(5000));
	}
}
