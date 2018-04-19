package code;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAcc {

	@Test
	public void addAccount() {

		Service testService = new Service();
		Account testing = new Account("jon", "doe", "4");
		testService.addAccount(testing);
		assertEquals(testService.getHmap().size(), 1);

	}

	@Test
	public void removeAccount() {

		Service testService1 = new Service();
		Account testing1 = new Account("jack", "doel", "5");
		testService1.addAccount(testing1);
		testService1.removeAccount(1);
		assertEquals(testService1.getHmap().size(), 0);

	}

	@Test
	public void retrieve1() {

		Account testing2 = new Account("tom", "dop", "6");
		Service testService2 = new Service();
		testService2.addAccount(testing2);
		assertEquals(testing2, testService2.retrieve1(1));

	}

	@Test
	public void getJson() {

		Service service = new Service();
		Account testing3 = new Account("Nabeel", "Muja", "1");
		service.addAccount(testing3);
		Json util = new Json();
		String compare = "{\"1\":{\"firstName\":\"Nabeel\",\"lastName\":\"Muja\",\"AccountNumber\":\"1\"}}";
		String actual = util.getJson(service.getHmap());
		assertEquals(actual, compare);
	}

	private Service accountmap;

	@Test
	public void retrieve2() {

		Account account1 = new Account("John", "Bacon", "9");
		Account account2 = new Account("John", "Bacon", "9");
		accountmap = new Service();
		accountmap.addAccount(account1);
		accountmap.addAccount(account2);
		int expectedValue = 2;
		int actualValue = accountmap.retrieve2("John");
		assertEquals(expectedValue, actualValue);

	}

	@Test
	public void retrieve3() {

		Account account1 = new Account("John", "Bacon", "9");
		Account account2 = new Account("John", "Bacon", "9");
		accountmap = new Service();
		accountmap.addAccount(account1);
		accountmap.addAccount(account2);
		int expectedValue = 2;
		int actualValue = accountmap.retrieve3("John");
		assertEquals(expectedValue, actualValue);

	}

}
