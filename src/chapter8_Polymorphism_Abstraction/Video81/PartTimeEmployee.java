package chapter8_Polymorphism_Abstraction.Video81;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee(int hoursWorked, double hourlyRate, String name, String department) {
		super(name, department);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return this.hoursWorked * this.hourlyRate;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Type: Part-time");
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
}
