package br.com.pratica.modelos;

public class CarroModelo extends Carro {
    private String tipoTracao;
    private int anoCarro;

    public void definirTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public void definirAno(int anoCarro) {
        this.anoCarro = anoCarro;
    }

    public void exibirDetalhesModelo() {
        System.out.println("Tipo de tração: " + tipoTracao);
        System.out.println("Ano do carro: " + anoCarro);
    }
}