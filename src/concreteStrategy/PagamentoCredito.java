package concreteStrategy;

import interfaceStrategy.FormaPagamentoStrategy;

public class PagamentoCredito implements FormaPagamentoStrategy{
	private double aumento;
	
	@Override
	public void realizarPagamento(double valor) {
		// TODO Auto-generated method stub
		aumento = 1.05;
		valor = valor * aumento;
		System.out.println("Pagamento de R$"+valor+" realizado com o cartão de crédito!");
	}
	
}
