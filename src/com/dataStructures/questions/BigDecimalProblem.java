package com.dataStructures.questions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class BigDecimalProblem {

	public static void main(String []args){
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
      	sc.close();

        //Write your code here
      	
//      	for(int i = 0; i < s.length - 2; i++) {
//      		for (int j = i + 1; j < s.length - 2; j++) {
//      			
//      			BigDecimal a = new BigDecimal(s[i]);
//      			BigDecimal b = new BigDecimal(s[j]);
//      			if (a.compareTo(b) == 0) {
//      				continue;
//      			}
//      			if (a.compareTo(b) == -1) {
//      				String aux = s[i];
//      				s[i] = s[j];
//      				s[j] = aux;				
//      			}
//      		}
//      	}
      	Arrays.sort(str, new Comparator<Object>() {
            @Override
            public int compare(Object n1, Object n2) {
                BigDecimal bd1 = new BigDecimal((String) n1);
                BigDecimal bd2 = new BigDecimal((String) n2);
                return bd2.compareTo(bd1);
            }
        }); 
        for(int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }	
}
