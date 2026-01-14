package chapter7_Inheritance.Video69;

public class Manager extends Employee {
	String department;

	public Manager(String department, String name, int id, double salary) {
		super(name, id, salary);
		this.department = department;
	}

	@Override
	public double calculateSalary() {
		double currentSalary = super.calculateSalary();
		return 1.1 * currentSalary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
