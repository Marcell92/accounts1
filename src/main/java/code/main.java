package code;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {

		Account person1 = new Account("Marcell", "Illes", 1);
		Account person2 = new Account("Nabeel", "Muja", 2);
		
		Service map = new Service();
		
		map.addAccount(person1);
		map.addAccount(person2);
		
		
		System.out.println(map.retrieve(2));
		
//		map.removeAccount(1);
		
		System.out.println(map.retrieve(1));
		
		
		
	}

}
