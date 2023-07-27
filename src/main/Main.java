package main;

import concreteStrategy.PagamentoCredito;
import concreteStrategy.PagamentoDebito;
import concreteStrategy.PagamentoPix;
import contextStrategy.PagamentoCompra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorCompra = 100.0;
		
		PagamentoCompra compra = new PagamentoCompra(valorCompra);
		
		// Cartão de Débito
		compra.setFormaPagamentoStrategy(new PagamentoDebito());
		compra.pagar();
		
		// Cartão de Crédito
		compra.setFormaPagamentoStrategy(new PagamentoCredito());
		compra.pagar();
		
		// Pix
		compra.setFormaPagamentoStrategy(new PagamentoPix());
		compra.pagar();
	}

}
