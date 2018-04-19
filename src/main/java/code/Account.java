package code;

public class Account {

	private String firstName;
	private String lastName;
	private String AccountNumber;

	public Account(String firstName, String lastName, String AccountNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.AccountNumber = AccountNumber;
	}

	public String getLastName() {
		return lastName;
	}

//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}

	public String getFirstName() {
		return firstName;
	}

//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}

	public String getAccountNumber() {
		return AccountNumber;
	}

//	public void setAccountNumber(int accountNumber) {
//		AccountNumber = accountNumber;
//	}

}
