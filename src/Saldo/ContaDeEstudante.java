package Saldo;

public class ContaDeEstudante {
	private ManipularSaldos manipulador;
	private int milhas;

	public ContaDeEstudante() {
		this.manipulador = new ManipularSaldos();
	}

	public void deposita(double valor) {
		manipulador.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}
}
