package br.com.pratica.modelos;

public class AnimalGato extends Animal {
    @Override
    public String emitirSom() {
        return "Meoww";
    }

    public String arranharMoveis() {
        return "arranha os móveis de casa: " +  "Scratch Screech";
    }
}
