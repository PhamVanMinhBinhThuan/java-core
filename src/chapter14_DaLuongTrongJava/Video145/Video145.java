package chapter14_DaLuongTrongJava.Video145;

public class Video145 {
	public static void main(String[] args) {
		// Cach 1
		PhamPham test = new PhamPham();
		Thread myThread = new Thread(test);
		myThread.start();

		// Cach 2: Lamda syntax
		Thread mySecondThread = new Thread(() -> {
			System.out.println("My second thread");
		});
		mySecondThread.start();
	}
}
