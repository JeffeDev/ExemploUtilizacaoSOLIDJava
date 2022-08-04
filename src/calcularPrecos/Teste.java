package calcularPrecos;

public class Teste {
	public static void main(String[] args) {
		TabelaDePreco tabela = new TabelaDePrecoDiferenciada();
		ServicoDeEntrega entrega = new Frete();
		new CalcularPrecos(tabela, entrega);
	}
}
