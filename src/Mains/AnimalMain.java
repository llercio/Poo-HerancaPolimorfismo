package Mains;

import br.com.pratica.modelos.AnimalCachorro;
import br.com.pratica.modelos.AnimalGato;

public class AnimalMain {
    static void main() {
        AnimalCachorro snoopy = new AnimalCachorro();
        snoopy.setNome("Snoopy");

        AnimalGato garfield = new AnimalGato();
        garfield.setNome("Garfield");

        System.out.println("Snoopy está latindo: " + snoopy.emitirSom());
        System.out.println("Garfield está miando: " + garfield.emitirSom());
        System.out.println("Snoopy " + snoopy.cavar());
        System.out.println("Garfield " + garfield.arranharMoveis());
    }
}
