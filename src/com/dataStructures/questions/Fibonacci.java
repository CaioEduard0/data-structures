package com.dataStructures.questions;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public static void main(String[] args) {
		
        System.out.println(fibonacci(28));
    }
	
	public static int fibonacci(int index) {
		List<Integer> fibonacciList = new ArrayList<>();
        
        int num1 = 1, num2 = 2;
        
        fibonacciList.add(num1);
        fibonacciList.add(num2);
        System.out.print(num1 + ", " + num2);
        for(int i = 0; i < 50; i++){
            
            num1 = num2 - num1;
            num2 += num1;
            fibonacciList.add(num2);
            System.out.print(", " + num2);
        }
        System.out.println();
        System.out.println();
        return fibonacciList.get(index - 1);
	}
}
