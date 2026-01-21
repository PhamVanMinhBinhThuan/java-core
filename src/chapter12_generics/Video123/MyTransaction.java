package chapter12_generics.Video123;

public class MyTransaction<ID, AMOUNT, STATUS> {
	private ID transactionId;
	private AMOUNT amount;
	private STATUS status;

	public MyTransaction(ID transactionId, AMOUNT amount, STATUS status) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.status = status;
	}

	@Override
	public String toString() {
		return "MyTransaction [transactionId=" + transactionId + ", amount=" + amount + ", status=" + status + "]";
	}

	public ID getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(ID transactionId) {
		this.transactionId = transactionId;
	}

	public AMOUNT getAmount() {
		return amount;
	}

	public void setAmount(AMOUNT amount) {
		this.amount = amount;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}
}
