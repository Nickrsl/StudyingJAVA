package Aula8.polimorfismo;

public class Main {
    public static void main(String[] args) {

        //A classe Animal é abstrata, portanto não pode ser instanciada
        // Serve somente como modelo para suas classes filhas

        /*Animal rato = new Animal("Rato", "Mus musculus", "Terrenos Baldios");
        System.out.println(rato.getNome());
        System.out.println(rato.getEspecie());
        System.out.println(rato.getHabitat());*/

        Animal bel = new Gato(); // Polimorfismo -> só pega atributos de animal
        Cachorro taila = new Cachorro();

        bel.emitirSom();
        taila.emitirSom();

        //System.out.println(bel.getCorPelo());
    }
}
