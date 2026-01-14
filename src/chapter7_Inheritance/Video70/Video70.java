package chapter7_Inheritance.Video70;

public class Video70 {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(sum(3, 5));
		System.out.println(sum(3.1, 5.1));
		System.out.println(sum(3, 5, 2));
	}
}
