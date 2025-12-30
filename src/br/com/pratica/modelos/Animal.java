package br.com.pratica.modelos;

public class Animal {
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String emitirSom() {
        return "Som de animal";
    }
}
