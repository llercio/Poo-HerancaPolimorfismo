package br.com.pratica.modelos;

public class AnimalCachorro extends Animal {
    @Override
    public String emitirSom() {
        return "Woof woof";
    }

    public String cavar() {
        return "cava procurando por alguma coisa: " + "Chuff chuff";
    }
}
