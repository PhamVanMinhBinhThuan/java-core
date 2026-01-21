package chapter9_Enum_NestedClass.Lab07;

public class Video94 {
	public static void main(String[] args) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				OrderStatus myStatus = OrderStatus.PENDING;

				Order myOrder = new Order("A001", myStatus);
				myOrder.processOrder();

				Order.CustomerInfo myInfo = myOrder.new CustomerInfo("Pham Pham", "0123456789");
				myInfo.printInfo();

				Order.DiscountHelper myDiscount = new Order.DiscountHelper();
				myDiscount.calculateDiscount(myStatus);

				System.out.println(
						"Don hang " + myOrder.getId() + " dang duoc xu ly o trang thai: " + myStatus.getDescription());
			}
		};
		task.run();
	}
}
