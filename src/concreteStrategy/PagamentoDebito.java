package concreteStrategy;

import interfaceStrategy.FormaPagamentoStrategy;

public class PagamentoDebito implements FormaPagamentoStrategy{

	@Override
	public void realizarPagamento(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Pagamento de R$"+valor+" realizado com o cartão de débito!");
	}
	
}
