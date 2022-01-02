package com.dataStructures.abstractTest;

public class Visa implements FormaPagamento {
	
	@Override
	public double calculaImposto(double total) {
		return total * 0.50;
	}

}