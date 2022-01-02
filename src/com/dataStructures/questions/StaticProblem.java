package com.dataStructures.questions;

import java.util.Scanner;

public class StaticProblem {
	
	public static void main(String[] args) {
		
		if(flag){
			int area = B * H;
			System.out.print(area);
		}
	}
	
	static boolean flag;
	static int B;
	static int H;

	static {
		Scanner sc = new Scanner(System.in);		
		B = sc.nextInt();
		H = sc.nextInt();		
		sc.close();
		
		if (B > 0 && H > 0) {
			flag = true;
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
}