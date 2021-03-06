package code;

import java.util.HashMap;

public class Service {

	private HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();

	HashMap<Integer, Account> getHmap() {
		return hmap;
	}

	// public void setHmap(HashMap<Integer, Account> hmap) {
	// this.hmap = hmap;
	// }

	private int uniqueID = 0;

	public void addAccount(Account newAccount) {

		uniqueID++;
		hmap.put(uniqueID, newAccount);

	}

	public void removeAccount(int selectID) {

		boolean uniqueIDexists = hmap.containsKey(selectID);

		if (uniqueIDexists) {
			hmap.remove(selectID);
		}
	}

	public Account retrieve1(int selectID) {

		return hmap.get(selectID);
	}

	public String retrieve(int selectID) {

		return "First name: " + hmap.get(selectID).getFirstName() + " Last name: " + hmap.get(selectID).getLastName()
				+ " Acc number: " + hmap.get(selectID).getAccountNumber();
	}

	public int retrieve2(String name) {

		int count = 0;

		for (Account map : hmap.values()) {

			if (map.getFirstName().equals(name)) {

				count++;
			}

		}
		return count;
	}
	
	public int retrieve3(String name) {		
		return (int) hmap.values().stream().filter(example -> name.equals(example.getFirstName())).count();
}

}
