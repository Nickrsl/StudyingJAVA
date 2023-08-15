package Aula8.polimorfismo;

public class Cachorro extends Animal{
    @Override // -> Anotação
    public void emitirSom() {
        System.out.println("Au, Au!");
    }

    public Cachorro() {
    }

    public Cachorro(String nome, String especie, String habitat) {
        super(nome, especie, habitat);
    }
}
