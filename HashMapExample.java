package com.hcl;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		System.out.println("Ninja Dashboard");
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "Naruto");
		map.put("2", "Sasuke");
		map.put("3", "Sakura");
		map.put("4", "Kakashi");

		// iteraring through the elements
		for (Map.Entry<String, String> entry : map.entrySet()) {
			map.put("5", "Rock Lee");
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
