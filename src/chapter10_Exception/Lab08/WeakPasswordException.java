package chapter10_Exception.Lab08;

public class WeakPasswordException extends RuntimeException {
	public WeakPasswordException(String message) {
		super(message);
	}
}
