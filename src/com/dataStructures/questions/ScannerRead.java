package com.dataStructures.questions;

import java.io.IOException;
import java.util.Scanner;

public class ScannerRead {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
	    int i=1;
        while (sc.hasNext()) {
        	String s=sc.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
        sc.close();
	}	
}
