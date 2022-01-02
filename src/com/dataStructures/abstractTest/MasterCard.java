package com.dataStructures.abstractTest;

public class MasterCard implements FormaPagamento {
	
	
	@Override
	public double calculaImposto(double total) {
		return total * 0.10;
	}
}
