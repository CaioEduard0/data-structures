package com.dataStructures.abstractTest;

import java.util.Scanner;

class MyCalculator {
    int power(int n, int p) throws Exception {
        if (n < 0 && p < 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n == 0 || p == 0) {
            throw new Exception("n or p should not be negative.");
        }
        Double result = Math.pow(Double.parseDouble(n+""), Double.parseDouble(p+""));
        return result.intValue();
    }
}

public class Test {
	
	

	    public static final MyCalculator my_calculator = new MyCalculator();
	    public static final Scanner in = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        while (in .hasNextInt()) {
	            int n = in .nextInt();
	            int p = in .nextInt();
	            
	            try {
	                System.out.println(my_calculator.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	
//		
//		Employee p = new Employee("caio", 2500);
//	
//		System.out.println(p);
//		System.out.println(p.finalSalary());
		
//Interfaces test		
		
//		Pagamento pagamento = new Pagamento();
//		pagamento.setFormaPagamento(new Visa());
//		pagamento.setTotal(2000);
//		//f.calculaImposto(2000)
//		System.out.println(pagamento.getTotal());
		
//		List<Integer> i = Arrays.asList(1, 2, 3);
		//i.stream().
		
	   


}
