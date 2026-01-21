package chapter9_Enum_NestedClass.Lab07;

public class Order {
	private String id;
	private OrderStatus status;

	public Order(String id, OrderStatus status) {
		this.id = id;
		this.status = status;
	}

	public void processOrder() {
		// Local Class
		class Logger {
			public String log() {
				return "[LOG] Xu ly don hang ID: " + id + " - Trang thai: " + status.getDescription();
			}
		}

		Logger l = new Logger();
		System.out.println(l.log());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	// Inner Class
	class CustomerInfo {
		private String name;
		private String phone;

		public CustomerInfo(String name, String phone) {
			this.name = name;
			this.phone = phone;
		}

		public void printInfo() {
			System.out.println("Khach hang: " + this.name + " - " + this.phone);
			System.out.println("Trang thai don hang: " + status.getDescription());
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
	}

	// Static Nested C lass
	static class DiscountHelper {
		public void calculateDiscount(OrderStatus status) {
			if (status == OrderStatus.SHIPPED) // if (status.name().equals("SHIPPED"))
				System.out.println("Chiet khau ap dung: 10.0%");
			else if (status == OrderStatus.DELIVERED || status == OrderStatus.CANCELLED)
				System.out.println("Chiet khau ap dung: 0.0%");
			else
				System.out.println("Chiet khau ap dung: 5.0%");
		}
	}
}
