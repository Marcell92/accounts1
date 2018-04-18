package code;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAcc {

	@Test
	public void addAccount() {
		
		Account testing = new Account("jon", "doe", 4);
		Service testService = new Service();
		testService.addAccount(testing);
		assertEquals(testService.getHmap().size(),1);
		
	}
	
	@Test
	public void removeAccount() {
		
		Account testing1 = new Account("jack", "doel", 5);
		Service testService1 = new Service();
		testService1.addAccount(testing1);
		testService1.removeAccount(1);
		assertEquals(testService1.getHmap().size(),0);

	}
	
	@Test
	public void retrieve() {
		
		Account testing2 = new Account("tom", "dop", 6);
		Service testService2 = new Service();
		testService2.addAccount(testing2);
		assertEquals(testService2.getHmap().size(),1);
		
	}
	
	
	
	
	
	

}
