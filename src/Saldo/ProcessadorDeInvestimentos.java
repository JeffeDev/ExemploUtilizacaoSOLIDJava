package Saldo;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (Object conta : contasDoBanco()) {
            ((ContaComum) conta).rende();

            System.out.println("Novo Saldo:");
            System.out.println(((ContaComum) conta).getSaldo());
        }
    }

    private static List<Object> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), contaDeEstudanteCom(200));
    }

    private static ContaDeEstudante contaDeEstudanteCom(double amount) {
        ContaDeEstudante conta = new ContaDeEstudante();
        conta.deposita(amount);
        return conta;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }
}
