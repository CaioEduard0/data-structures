package com.dataStructures.questions;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
 
        for(int i = 0; i < t; i++){
            int a = in.nextInt(); 
            int b = in.nextInt();
            int n = in.nextInt();
            
            int[] array = new int[n]; 
            for (int j = 0; j < n; j++) {
            	         	
            	int result = 0;
                if (j == 0) {
                	array[j] = a + b;              	
                } else {
                	array[j] = (int) (Math.pow(2, j) * b);
                }              
                for (int x = 0; x < array.length; x++) {
                	result += array[x];
                }    
                System.out.printf("%d ", result);
            }
            System.out.println();          
        }
        in.close();
    }
}

	


