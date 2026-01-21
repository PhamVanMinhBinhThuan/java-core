package chapter10_Exception.Lab08;

public class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String message) {
		super(message);
	}
}
