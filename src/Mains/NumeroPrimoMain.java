package Mains;

import br.com.pratica.modelos.GeradorPrimo;
import br.com.pratica.modelos.NumerosPrimos;
import br.com.pratica.modelos.VerificarPrimo;

public class NumeroPrimoMain {
    static void main() {
        VerificarPrimo verificador = new VerificarPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}
