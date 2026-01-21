package chapter14_DaLuongTrongJava.Video144;

public class MySecondThread extends Thread {
	private String name;

	public MySecondThread(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Run my second thread");
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(name + " is running with i = " + i);
//				Thread.sleep(500);
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
