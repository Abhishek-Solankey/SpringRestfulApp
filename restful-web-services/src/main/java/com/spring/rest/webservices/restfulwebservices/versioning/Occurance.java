package com.spring.rest.webservices.restfulwebservices.versioning;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
	
	public static void main (String args[]) {
		
		String input = "Today Friday Today Sunday Today";
		
		String inputArray [] = input.split(" ");
		
		  Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for (String s : inputArray) {
		
			if(hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s)+1);
			} else {
				hashMap.put(s, 1);
			}
		}
		
		
		for (String key : hashMap.keySet()) {
			if(hashMap.get(key) == 1) {
				System.out.println(key);
			}
		}
		
	}
	
	
}
