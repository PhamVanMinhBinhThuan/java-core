package chapter5_array_string;

public class Video47 {
	public static void main(String[] args) {

		String s = "";
		for (int i = 0; i < 1000; i++) {
			s += i;
		}
		System.out.println(s);

		StringBuilder s2 = new StringBuilder();
		for (int i = 0; i < 1000; i++) {
			s2.append(i);
		}
		System.out.println(s);
	}
}
