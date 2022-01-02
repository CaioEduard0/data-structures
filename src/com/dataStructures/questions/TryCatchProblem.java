package com.dataStructures.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x / y);
		} catch (InputMismatchException error) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException error) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}		
		sc.close();
	}
}
