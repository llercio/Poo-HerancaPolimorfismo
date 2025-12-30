package br.com.pratica.modelos;

public class contaCorrente extends ContaBancaria {

    public double cobraTarifaMensal(int tarifa) {
        return getSaldo() - (tarifa/100);
    }
}
