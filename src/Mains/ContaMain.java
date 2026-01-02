package Mains;

import br.com.pratica.modelos.ContaBancaria;
import br.com.pratica.modelos.ContaCorrente;

public class ContaMain {
    static void main() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();
        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setTarifaMensal(49.99);
        contaCorrente.depositar(500);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(50.01);
    }
}
