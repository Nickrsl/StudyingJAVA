package Aula8.polimorfismo;

public class Gato extends Animal{
    private String corPelo;
    @Override // -> Anotação
    public void emitirSom() {
        System.out.println("Miau, Miau!");
    }

    public Gato() {
    }

    public Gato(String nome, String especie, String habitat, String corPelo) {
        super(nome, especie, habitat);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
