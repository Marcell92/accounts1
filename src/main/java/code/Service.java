package code;

import java.util.HashMap;
import java.util.Random;

public class Service {

	private HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();

	HashMap<Integer, Account> getHmap() {
		return hmap;
	}

	public void setHmap(HashMap<Integer, Account> hmap) {
		this.hmap = hmap;
	}


	public void addAccount(Account newAccount) {
		hmap.put(newAccount.getAccountNumber(), newAccount);

	}

	public void removeAccount(int accNum) {

		boolean uniqueAccNum = hmap.containsKey(accNum);

		if (uniqueAccNum) {

			hmap.remove(accNum);
		}
	}

	public Account retrieve1(int accNum) {

		return hmap.get(accNum);
	}

	public String retrieve(int accNum) {

		return "First name: " + hmap.get(accNum).getFirstName() + " Last name: " + hmap.get(accNum).getLastName()
				+ " Acc number: " + hmap.get(accNum).getAccountNumber();
	}
	
	public int generateAccNum() {
		Random rand = new Random();
		int number;
		do {
			number = rand.nextInt(10000) + 1;
		} while(hmap.containsKey(number));
		
		return number;
	}

}
