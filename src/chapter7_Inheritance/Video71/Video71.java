package chapter7_Inheritance.Video71;

public class Video71 {
	public static void main(String[] args) {
		CustomerPrinter customer = new CustomerPrinter();

		customer.print("Ng A");
		customer.print("Ng B", 18);
		customer.print("Ng C", 19, "Binh Thuan");
	}
}
