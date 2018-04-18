package code;

import java.util.HashMap;
import com.google.*;
import com.google.gson.Gson;

public class main {

	public static void main(String[] args) {

		
		Service map = new Service();
		
		Account person1 = new Account("Marcell", "Illes", map.generateAccNum());
		Account person2 = new Account("Nabeel", "Muja", map.generateAccNum());

		map.addAccount(person1);
		map.addAccount(person2);

		System.out.println(map.retrieve(person2.getAccountNumber()));
		System.out.println(map.retrieve(person1.getAccountNumber()));
		
		map.removeAccount(person1.getAccountNumber());

		Gson gson = new Gson();
		String json = gson.toJson(map.getHmap());
		System.out.println(json);

	}
	
//	public void gson() {
//		
//		Gson gson = new Gson();
//		String json = gson.toJson(map.getHmap());
//		System.out.println(json);
//		
//	}

}
