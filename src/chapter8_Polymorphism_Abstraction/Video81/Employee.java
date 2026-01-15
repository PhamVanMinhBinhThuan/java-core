package chapter8_Polymorphism_Abstraction.Video81;

public abstract class Employee {
	private String name;
	private String department;

	public Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	abstract double calculateSalary();

	public void printInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Department: " + this.department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
