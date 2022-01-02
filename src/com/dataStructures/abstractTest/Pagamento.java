package com.dataStructures.abstractTest;

public class Pagamento {
	
	private double total;
	private FormaPagamento formaPagamento;
//	public Pagamento(double total, FormaPagamento formaPagamento) {
//		super();
//		this.total = total;
//		this.formaPagamento = formaPagamento;
//	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total += total + this.formaPagamento.calculaImposto(total);
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
}
