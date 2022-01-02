package com.dataStructures.questions;

import java.util.Scanner;

public class String2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        System.out.println(A.length() + B.length());
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        if (a[0] > b[0]) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
        sc.close();
	}
}
