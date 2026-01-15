package chapter8_Polymorphism_Abstraction.Lab06;

public class Video85 {
	public static void main(String[] args) {
		Engineer myEngineer = new Engineer("AI", "Alice", 25);
		Manager myManager = new Manager(10, "Bob", 40);

		Person[] list = { myEngineer, myManager };

		for (Person person : list) {
			person.introduce();
			person.work();

			if (person instanceof Engineer) {
				Engineer temp = (Engineer) person;
				temp.attendTraining("Cloud Computing");
				temp.feedback();
			} else if (person instanceof Manager) {
				Manager temp = (Manager) person;
				temp.attendTraining("Leadership");
				temp.feedback();
			}

			System.out.println();
		}
	}
}
