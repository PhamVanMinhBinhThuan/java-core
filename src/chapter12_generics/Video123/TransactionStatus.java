package chapter12_generics.Video123;

public enum TransactionStatus {
	SUCCESS("Thanh cong"), FAILED("That bai");

	private final String description;

	private TransactionStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
