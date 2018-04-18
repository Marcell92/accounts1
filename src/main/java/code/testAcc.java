package code;

import static org.junit.Assert.*;


import org.junit.Test;

public class testAcc {

	@Test
	public void addAccount() {

		Service testService = new Service();
		Account testing = new Account("jon", "doe", 4);
		testService.addAccount(testing);
		assertEquals(testService.getHmap().size(), 1);

	}

	@Test
	public void removeAccount() {
		
		Service testService1 = new Service();
		Account testing1 = new Account("jack", "doel", 5);
		testService1.addAccount(testing1);
		testService1.removeAccount(2);
		assertEquals(testService1.getHmap().size(), 0);

	}

	@Test
	public void retrieve1() {

		Account testing2 = new Account("tom", "dop", 6);
		Service testService2 = new Service();
		testService2.addAccount(testing2);
		assertEquals(testing2, testService2.retrieve1(1));

	}
	
	

}
