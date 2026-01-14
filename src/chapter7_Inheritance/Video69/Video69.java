package chapter7_Inheritance.Video69;

public class Video69 {
	public static void main(String[] args) {
		Manager manager = new Manager("IT", "Pham Pham", 1, 10000);
		Programmer programmer = new Programmer("Ng A", 2, 10000);

		System.out.println("Manager Salary: " + manager.calculateSalary());
		System.out.println("Programmer Salary: " + programmer.calculateSalary());
	}
}
