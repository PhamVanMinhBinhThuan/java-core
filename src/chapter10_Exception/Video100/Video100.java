package chapter10_Exception.Video100;

public class Video100 {
	public static int divide(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Loi chia cho 0");
		}
		return a / b;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("a / b = " + divide(10, 0));
	}
}
