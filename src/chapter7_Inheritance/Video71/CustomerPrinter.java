package chapter7_Inheritance.Video71;

public class CustomerPrinter {

	public void print(String name) {
		System.out.println("1. Name: " + name);
	}

	public void print(String name, int age) {
		System.out.println("2. Name: " + name + ", Age: " + age);
	}

	public void print(String name, int age, String city) {
		System.out.println("3. Name: " + name + ", Age: " + age + ", City: " + city);
	}
}
