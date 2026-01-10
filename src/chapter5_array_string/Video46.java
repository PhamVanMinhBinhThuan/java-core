package chapter5_array_string;

public class Video46 {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}
