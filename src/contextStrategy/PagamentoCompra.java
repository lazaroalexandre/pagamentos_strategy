package contextStrategy;

import interfaceStrategy.FormaPagamentoStrategy;

public class PagamentoCompra {
	private double total;
	private FormaPagamentoStrategy formaPagamentoStrategy;
	
	
	public PagamentoCompra(double total) {
		this.total = total;
	}

	public FormaPagamentoStrategy getFormaPagamentoStrategy() {
		return formaPagamentoStrategy;
	}

	public void setFormaPagamentoStrategy(FormaPagamentoStrategy formaPagamentoStrategy) {
		this.formaPagamentoStrategy = formaPagamentoStrategy;
	}
	
	public void pagar() {
		formaPagamentoStrategy.realizarPagamento(total);
	}
	
}
