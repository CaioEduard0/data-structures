package com.dataStructures.questions;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        String A = sc.next();
	        
	        int j = 0;
	        char[] c = new char[A.length()];
	        for (int i = A.length(); i > 0; i--) {
	        	c[j] = A.charAt(i - 1);
	        	j++;
	        }
	        if (A.compareTo(String.valueOf(c)) == 0) {
	        	System.out.println("Yes");
	        } else {
	        	System.out.println("No");
	        }      
	        sc.close();
	    }
}
