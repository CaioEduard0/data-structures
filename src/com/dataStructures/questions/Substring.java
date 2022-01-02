package com.dataStructures.questions;

import java.util.Scanner;

public class Substring {

	   public static String getSmallestAndLargest(String str, int size) {
	        String smallest = "";
	        String largest = "";	        
	        
	        String aux = null;
	        for (int i = 0; i <= str.length() - size; i++) {
	        	aux = str.substring(i, i + size);
	        	if (smallest == "" && largest == "") {
        			smallest = aux;
	        		largest = aux;
        		}
	        	if (smallest.compareTo(aux) > 0) {
	        		smallest = aux;
	        	}
	        	if (largest.compareTo(aux) < 0) {
	        		largest = aux;
	        	}
	        }     
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String str = scan.next();
	        int size = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(str, size));
	    }
}
