package chapter14_DaLuongTrongJava.Video144;

public class Video144 {
	public static void main(String[] args) {

		MyFirstThread firstThread = new MyFirstThread("First thread");
		MySecondThread secondThread = new MySecondThread("Second thread");

//		firstThread.run();
//		secondThread.run();

		firstThread.start();
		secondThread.start();
	}
}
