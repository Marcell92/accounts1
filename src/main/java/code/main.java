package code;

import java.util.HashMap;
import com.google.*;
import com.google.gson.Gson;

public class main {

	public static void main(String[] args) {

		
		Service map = new Service();
		
		Account person1 = new Account("Marcell", "Illes", "1");
		Account person2 = new Account("Nabeel", "Muja", "2");

		map.addAccount(person1);
		map.addAccount(person2);

		System.out.println(map.retrieve(1));
		System.out.println(map.retrieve(2));
		
		map.removeAccount(1);
		
		Json util = new Json();
    	String json = util.getJson(map.getHmap());
    	System.out.println(json);
	}
	

}
