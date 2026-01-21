package chapter10_Exception.Lab08;

public class BankAccount {
	private String username;
	private String password;
	private double balance;

	public BankAccount(String username, String password, double balance) {
		if (password.length() < 6)
			throw new WeakPasswordException("WeakPasswordException: Mật khẩu phải có ít nhất 6 ký tự");

		this.username = username;
		this.password = password;
		this.balance = balance;
	}

	public void withdraw(double amount) throws NegativeBalanceException {
		if (amount > this.balance)
			throw new NegativeBalanceException("NegativeBalanceException: Không đủ số dư để rút tiền.");
		this.balance -= amount;
		System.out.println("Rút tiền thành công. Số dư còn lại: " + this.balance);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
