package chapter9_Enum_NestedClass.Lab07;

public enum OrderStatus {
	PENDING("Cho xac nhan"), SHIPPED("Dang giao hang"), DELIVERED("Da giao"), CANCELLED("Da huy");

	private final String description; // Enum luon la private final

	private OrderStatus(String description) {
		this.description = description;
	}

	public boolean hasFinal() {
		if (this == DELIVERED || this == CANCELLED) { // Enum dung this
			return true;
		}
		return false;
	}

	public String getDescription() {
		return description;
	}
}
