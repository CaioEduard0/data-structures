package com.dataStructures.questions;

import java.util.Scanner;

//import com.example.phonebook.dto.UserDTO;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int number = sc.nextInt();
		sc.nextLine();
		
		String[] words = new String[number];
		String[] word = null;
		
		for (int i = 0; i < number; i++) {
			words[i] = sc.nextLine();
		}
		
		for (int i = 0; i < number; i++) {
			word = words[i].split(",");
			String w1 = word[0];
			String w2 = word[1];
			
			if (isAnagram(w1.trim().toUpperCase(), w2.trim().toUpperCase())) {
				System.out.println("Is");
			} else {
				System.out.println("Is not");
			}
		}
		sc.close();
	}
	
	public static boolean isAnagram(String a, String b) {
		// will be used if the anagram only accepts letters. in this case we convert to uppercase
//		int x = 0, y = 0;
//		if (a.length() != b.length()) {
//			return false;
//		}
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) >= 65 && a.charAt(i) <= 90 ) {
//                x += a.charAt(i);
//            }
//        }       
//        for (int i = 0; i < b.length(); i++) {
//            if (b.charAt(i) >= 65 && b.charAt(i) <= 90 ) {
//                y += b.charAt(i);
//            }
//        }
       char[] c = a.toCharArray();
   	char[] d = b.toCharArray();
//        if (x == y) {
        	      	
        	for (int i = 0; i < c.length; i++) {
        		for (int j = i + 1; j < c.length; j++) {
        			
        			char aux;
        			if (String.valueOf(c[i]).compareTo(String.valueOf(c[j])) > 0) {
        				aux = c[i];
        				c[i] = c[j];
        				c[j] = aux; 				
        			}
        			if (String.valueOf(d[i]).compareTo(String.valueOf(d[j])) > 0) {
        				aux = d[i];
        				d[i] = d[j];
        				d[j] = aux; 				
        			}
        		}
        	}     	
        //}
        return String.valueOf(c).compareTo(String.valueOf(d)) == 0;
	}
}
