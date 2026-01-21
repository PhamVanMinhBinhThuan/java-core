package chapter12_generics.Video123;

public class Video123 {
	public static void main(String[] args) {
		MyTransaction<Integer, Double, String> t1 = new MyTransaction<>(1, 1200.5, "SUCCESS");
		System.out.println(t1);

		MyTransaction<String, Integer, TransactionStatus> t2 = new MyTransaction<>("2", 1200, TransactionStatus.FAILED);
		System.out.println(t2);
	}
}
