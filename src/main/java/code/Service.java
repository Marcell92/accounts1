package code;

import java.util.HashMap;

public class Service {
	
	HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();

	private static int uniqueID = 0;

	public void addAccount(Account newAccount) {
		
		hmap.put(uniqueID, newAccount);
		uniqueID++;

	}

	public void retrieveAccount(int SelectID) {
		
		hmap.get(SelectID);

	}
	
	public void removeAccount (int selectID) {
		
		hmap.remove(selectID);
	}
	
	public String toString (Service service) {
		
		return "I added: " + service;
		
		
	}

}
