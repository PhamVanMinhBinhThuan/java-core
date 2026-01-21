package chapter9_Enum_NestedClass.Video91;

public enum OrderStatus {
	PENDING("Cho xac nhan"), SHIPPED("Dang giao hang"), DELIVERED("Da giao"), CANCELLED("Da huy");

	private final String description;

	private OrderStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public boolean hasFinal() {
		if (this == DELIVERED || this == CANCELLED) {
			return true;
		}
		return false;
	}
}
