package chapter8_Polymorphism_Abstraction.Video81;

public class Video81 {
	public static void main(String[] args) {
		FullTimeEmployee e1 = new FullTimeEmployee(10000, "Ng A", "IT");
		PartTimeEmployee e2 = new PartTimeEmployee(8, 2500, "Ng B", "HR");

		Employee[] list = { e1, e2 };

		for (Employee employee : list) {
			employee.printInfo();
			System.out.println("Salary: " + employee.calculateSalary());
			System.out.println();
		}

	}
}
