package com.dataStructures.questions;

import java.util.Scanner;

public class SubArrayProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		str = sc.nextLine().split(" ");
		int result = 0;
		for (int i = 0; i < str.length; i++) {
			int sum = Integer.parseInt(str[i]);
			if (Integer.parseInt(str[i]) < 0) result ++;
			
			for (int j = i + 1; j < str.length; j++) {
				sum += Integer.parseInt(str[j]);
				if (sum < 0) result++;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
