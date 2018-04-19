package code;


import com.google.gson.Gson;

import java.util.HashMap;

public class Json {
	

	private Gson gson;

	public Json() {
		this.gson = new Gson();
	}

	public String getJson(HashMap accounts) {
		return gson.toJson(accounts);

}

}
