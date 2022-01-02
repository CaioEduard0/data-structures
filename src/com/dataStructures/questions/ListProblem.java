package com.dataStructures.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class ListProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String[] numbers = new String[length];
		numbers = sc.nextLine().split(" ");		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < numbers.length; i++) {
			list.add(Integer.parseInt(numbers[i]));
		}
		int queries = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < queries; i++) {
			String query = sc.nextLine();
			if (query.equals("Insert")) {
				String[] q = sc.nextLine().split(" ");
				list.add(Integer.parseInt(q[0]), Integer.parseInt(q[1]));
			} else if (query.equals("Delete")) {
				list.remove(sc.nextInt());
			}
		}
		for (Integer number : list) {
			System.out.print(number + " ");
		}
		sc.close();
	}
}
