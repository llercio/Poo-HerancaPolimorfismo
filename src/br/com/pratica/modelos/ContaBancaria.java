package br.com.pratica.modelos;

public class ContaBancaria {
    protected double saldo;


    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " Realizado. Saldo atual: " + saldo + ".");
    }

    public void sacar(double valor) {
        if (valor < saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso! Saldo atual: " + saldo + ".");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
