package com.dataStructures.questions;

import java.util.Scanner;

public class StringToken {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        String[] word = str.trim().split("[\\s!,?._'@]+");
        if (word.length == 0 || word[0].compareTo("") == 0 || !word[0].matches("[A-Za-z]+")) {
    		System.out.println("0");
    	} else {
    		System.out.println(word.length);
            for (int i = 0; i < word.length; i++) {
            	System.out.println(word[i]);
            }
    	}             
        scan.close();
    }
}
