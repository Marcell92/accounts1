package code;

public class Account {

	private String firstName;
	private String lastName;
	private int AccountNumber;

	public Account(String firstName, String lastName, int AccountNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.AccountNumber = AccountNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

}
