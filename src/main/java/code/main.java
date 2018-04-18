package code;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {

		Account person1 = new Account("Marcell", "Illes", 001);
		Account person2 = new Account("Nabeel", "Muja", 002);
		
		Service map = new Service();
		
		map.addAccount(person1);
		map.addAccount(person2);
		
		System.out.println(map);
		

	}

}
