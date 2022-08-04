package Saldo;

public class ContaComum {
	private ManipularSaldos manipulador;

	public ContaComum() {
		this.manipulador = new ManipularSaldos();
	}

	public void saca(double valor) {
		manipulador.saca(valor);
	}

	public void deposita(double valor) {
		manipulador.deposita(valor);
	}

	public void rende() {
		manipulador.rende(1.1);
	}

	public double getSaldo() {
		return manipulador.getSaldo();
	}
}