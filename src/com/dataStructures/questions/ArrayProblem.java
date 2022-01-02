package com.dataStructures.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayProblem {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int testArrays = sc.nextInt();
		sc.nextLine();
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < testArrays; i++) {
			list.add(sc.nextLine());
		}
		int queries = sc.nextInt();
		sc.nextLine();
		
		List<String> result = new ArrayList<>();
		for(int i = 0; i < queries; i++) {
			String[] query = sc.nextLine().split(" ");
			String[] numbers = (list.get((Integer.parseInt(query[0])-1)).split(" "));
			try {				
				result.add(numbers[Integer.parseInt(query[1])]);
			} catch (IndexOutOfBoundsException e) {
				result.add("ERROR!");
			}
		}		
		for (String s : result) {
			System.out.println(s);
		}
		sc.close();
	}
}
