package chapter8_Polymorphism_Abstraction.Lab06;

public class Manager extends Person implements Trainable {
	private int teamSize;

	public Manager(int teamSize, String name, int age) {
		super(name, age);
		this.teamSize = teamSize;
	}

	@Override
	public void work() {
		System.out.println("Manager " + super.getName() + " is managing a team of " + this.teamSize + " people.");
	}

	@Override
	public void attendTraining(String topic) {
		System.out.println("Manager " + super.getName() + " is attending management training on " + topic);
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}
