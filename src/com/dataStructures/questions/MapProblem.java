package com.dataStructures.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Map<String, Integer> phonebook = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			sc.nextLine();
			phonebook.put(name, phone);
		}
		while(sc.hasNext()) {
			String name = sc.nextLine();
			if (phonebook.containsKey(name)) {
				int value = phonebook.get(name);
				System.out.println(name + "=" + value);
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}
}
