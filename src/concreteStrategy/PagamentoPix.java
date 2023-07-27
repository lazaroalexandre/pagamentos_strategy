package concreteStrategy;

import interfaceStrategy.FormaPagamentoStrategy;

public class PagamentoPix implements FormaPagamentoStrategy{
	private double desconto;
	
	@Override
	public void realizarPagamento(double valor) {
		// TODO Auto-generated method stub
		desconto = 0.9;
		valor = valor * desconto;
		System.out.println("Pagamento de R$"+valor+" realizado com o pix!");
	}

}
