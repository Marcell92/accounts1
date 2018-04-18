package code;

import java.util.HashMap;

public class Service {
	
	HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();

	public HashMap<Integer, Account> getHmap() {
		return hmap;
	}


	public void setHmap(HashMap<Integer, Account> hmap) {
		this.hmap = hmap;
	}


	private static int uniqueID = 0;

	public void addAccount(Account newAccount) {
		
		uniqueID++;
		hmap.put(uniqueID, newAccount);

	}

	
	public void removeAccount (int selectID) {
		
		hmap.remove(selectID);
	}
	
	public Account retrieve1 (int selectID) {
		
		return hmap.get(selectID);
	}
	
	
	public String retrieve (int selectID) {
		
		return "First name: " + hmap.get(selectID).getFirstName() + " Last name: " + hmap.get(selectID).getLastName() + " Acc number: " + hmap.get(selectID).getAccountNumber();
	}

}
