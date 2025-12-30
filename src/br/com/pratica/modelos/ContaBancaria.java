package br.com.pratica.modelos;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;


    public double depositar(double deposito) {
        return saldo + deposito;
    }

    public double sacar(double saque) {
        return saldo - saque;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
