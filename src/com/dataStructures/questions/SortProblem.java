package com.dataStructures.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public double getCgpa() {
		return cgpa;
	}
}

class CompareStudents implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getCgpa() < o2.getCgpa()) {
			return 1;
		} else if (o1.getCgpa() > o2.getCgpa()){
			return -1;
		} else {
			if (o1.getFname().compareTo(o2.getFname()) > 0) {
				return 1;
			} else if (o1.getFname().compareTo(o2.getFname()) < 0) {
				return -1;
			} else {
				if (o1.getId() < o2.getId()) {
					return 1;
				} else {
					return -1;
				}
			}
		}
	}	
}

public class SortProblem {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		int testCases = Integer.parseInt(in.nextLine());
		List<Student> studentList = new ArrayList<>();
		
		while(testCases > 0) {

			String[] data = in.nextLine().split(" ");			
			Student student = new Student(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]));
			studentList.add(student);
			testCases--;
		}
		Collections.sort(studentList, new CompareStudents());
      	for(Student student: studentList){     		
			System.out.println(student.getFname());
		}
      	in.close();
	}
}
